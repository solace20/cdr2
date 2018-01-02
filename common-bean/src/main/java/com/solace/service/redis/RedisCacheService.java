package com.solace.service.redis;

/**
 * Created by solace on 2017/2/11.
 * function use
 */
public interface RedisCacheService {
    void put(Object key , Object value);
    Object get(Object key);
}
