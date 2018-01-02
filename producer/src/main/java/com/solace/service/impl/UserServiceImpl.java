package com.solace.service.impl;

import com.solace.mapper.UserMapper;
import com.solace.pojo.User;
import com.solace.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by solace on 2017/2/8.
 * function use
 */
@Service("UserService")
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    /**
     * example
     * @return
     */
    public User getUserByName() {
        return userMapper.selectByPrimaryKey("111");
    }
}
