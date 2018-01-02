package com.solace.service.impl.redis;

import com.solace.service.redis.RedisCacheService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.io.*;

/**
 * Created by solace on 2017/2/11.
 * function use redis基本操作类
 */
@Service("RedisCacheService")
public class RedisCacheServiceImpl implements RedisCacheService {
    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * redis存操作
     * @param key
     * @param value
     */
    @Override
    public void put(Object key, Object value) {
        ValueOperations operations = redisTemplate.opsForValue();
        operations.set(key,value);
    }

    /**
     * redis 取操作
     * @param key
     * @return
     */
    @Override
    public Object get(Object key) {
        ValueOperations operations = redisTemplate.opsForValue();
        return operations.get(key);
    }


}
