package com.solace.session;

import org.springframework.data.redis.core.RedisTemplate;

import javax.servlet.http.*;

/**
 * Created by solace on 2017/2/12.
 * function use
 */
public class TerryHttpServletRequestWrapper extends HttpServletRequestWrapper {
    private CacheHttpSession session;
    private HttpServletResponse response;
    private RedisTemplate redisTemplate;
    public TerryHttpServletRequestWrapper(HttpServletRequest request, HttpServletResponse response,RedisTemplate redisTemplate) {
        super(request);
        this.response = response;
        this.redisTemplate = redisTemplate;
    }

    @Override
    public HttpSession getSession(boolean create) {
        if(session != null) {
            return session;
        }
        String sid = "terry" + System.currentTimeMillis();
        writeSidToCookie(sid);
        session = new CacheHttpSession(null,sid,redisTemplate);
        return session;
    }

    @Override
    public HttpSession getSession() {
        return getSession(false);
    }
    protected void writeSidToCookie(String sid) {
        Cookie mycookies = new Cookie("terry", sid);
        mycookies.setMaxAge(-1);
        mycookies.setDomain("locahost");
        mycookies.setPath("/");
        response.addCookie(mycookies);
    }
}
