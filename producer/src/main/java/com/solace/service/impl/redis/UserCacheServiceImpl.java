package com.solace.service.impl.redis;

import com.alibaba.fastjson.JSON;
import com.solace.pojo.User;
import com.solace.service.redis.UserCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * Created by solace on 2017/2/15.
 * function use
 */
@Service("UserCacheServiceImpl")
public class UserCacheServiceImpl implements UserCacheService{
    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 用户添加redis缓存,设置过期时间30分钟
     * @param userKey
     * @param user
     */
    @Override
    public void addOrUpdate(String userKey, User user){
        redisTemplate.opsForValue().set(userKey, JSON.toJSONString(user),30, TimeUnit.MINUTES);
    }

    /**
     * 取用户信息时，更新过期时间
     * @param userKey
     * @return
     */
    @Override
    public User load(String userKey){
        System.out.println(userKey);
        if (redisTemplate.opsForValue().get(userKey)!=null) {
            User user = JSON.parseObject(redisTemplate.opsForValue().get(userKey).toString(), User.class);
            redisTemplate.expire(userKey, 30, TimeUnit.MINUTES);
            return user;
        }
        return null;
    }
}
