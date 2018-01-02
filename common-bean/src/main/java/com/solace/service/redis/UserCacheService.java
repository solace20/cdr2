package com.solace.service.redis;

import com.solace.pojo.User;

/**
 * Created by solace on 2017/2/15.
 * function use
 */
public interface UserCacheService {
    void addOrUpdate(String userKey, User user);
    User load(String userKey);
}
