package com.solace.interceptor;

import com.solace.service.LoginService;
import com.solace.service.redis.UserCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

/**
 * Created by solace on 2017/2/15.
 * function use
 */
public class CommonInterceptor extends HandlerInterceptorAdapter{
    @Autowired
    private LoginService loginService;
    /**
     * 用户是否第一次进入应用
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        boolean result = true;//是否第一次进入应用
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies){
            if ("user_key".equals(cookie.getName())){
                result = false;
                System.out.println("不是第一次");
                //判断令牌有效性
                if (!loginService.hasLogin(cookie.getValue())){
                    //这里有一个多次重定向的错误，不管，直接捕捉
                    try {
                        request.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request,response);
                        return;
                    }catch (Exception e){

                    }

                }
            }
        }
        if (result) {
            String user_key = UUID.randomUUID().toString();
            Cookie cookie1 = new Cookie("user_key", user_key);
            response.addCookie(cookie1);//新的cookie添加到客户端
            System.out.println("生成了一个cookie:"+user_key);
        }
    }
}
