package com.solace.service.impl;

import com.solace.Constans.LoginConstant;
import com.solace.mapper.UserMapper;
import com.solace.pojo.User;
import com.solace.pojo.UserExample;
import com.solace.service.LoginService;
import com.solace.service.redis.UserCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by solace on 2017/2/11.
 * function use
 */
@Service("LoginService")
public class LoginServiceImpl implements LoginService{
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserCacheService userCacheService;
    /**
     * 登录验证业务逻辑
     * @param username
     * @param password
     * @return
     */
    @Override
    public String dologin(String username, String password) {
        UserExample example = new UserExample();
        example.createCriteria().andUserNameEqualTo(username);
        if (userMapper.selectByExample(example)!=null){
            example.createCriteria().andPasswordEqualTo(password);
            User user = userMapper.selectByExample(example).get(0);
            if (user != null){
                return LoginConstant.LOGIN_SUCCESS;
            }else {
                return LoginConstant.LOGIN_FAILED;
            }
        }else {
            return LoginConstant.LOGIN_FAILED;
        }
    }

    /**
     * 验证用户是否已经登录逻辑
     * @param tokenId
     * @return
     */
    @Override
    public boolean hasLogin(String tokenId) {
        User user = userCacheService.load(tokenId);
        String result = null;
        if (user != null) {
            result = dologin(user.getUserName(), user.getPassword());
            if (LoginConstant.LOGIN_SUCCESS.equals(result)){
                return true;
            }
        }
        return false;
    }
}
