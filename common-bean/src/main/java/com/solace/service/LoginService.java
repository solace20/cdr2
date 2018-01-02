package com.solace.service;

/**
 * Created by solace on 2017/2/11.
 * function use
 */
public interface LoginService {
    String dologin(String username,String password);
    boolean hasLogin(String tokenId);
}
