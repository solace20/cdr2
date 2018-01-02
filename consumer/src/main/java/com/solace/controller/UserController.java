package com.solace.controller;

import com.solace.Constans.LoginConstant;
import com.solace.pojo.User;
import com.solace.service.LoginService;
import com.solace.service.UserService;
import com.solace.service.redis.RedisCacheService;
import com.solace.service.redis.UserCacheService;
import com.solace.utils.CaptchaUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

/**
 * Created by solace on 2017/2/8.
 * function use
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private RedisCacheService redisCacheService;

    @Autowired
    private LoginService loginService;

    @Autowired
    private UserCacheService userCacheService;

    @RequestMapping(value = "test")
    @ResponseBody
    public Object test(){
        redisCacheService.put("冷","豹");
        return redisCacheService.get("冷");
    }

    /**
     * 生成验证码控制器
     * @param request
     * @param response
     * @throws IOException
     * @throws ServletException
     */
    @RequestMapping(value = "captcha",method = RequestMethod.GET)
    @ResponseBody
    public void captcha(HttpServletRequest request , HttpServletResponse response) throws IOException, ServletException {
        CaptchaUtil.outputCaptcha(request,response);
        String a = (String) request.getSession().getAttribute("randomString");
        System.out.println(a);
    }

    @RequestMapping(value = "ws")
    public String ws(){
        return "chat";
    }

    /**
     * 登录拦截器
     * @param response
     * @return
     */
    @RequestMapping(value = "login")
    public String login(HttpServletResponse response){

        return "login";
    }

    /**
     * 登录拦截器
     * @param request
     * @param response
     * @param user
     * @return
     */
    @RequestMapping(value = "dologin",method = RequestMethod.POST)
    public String dologin(HttpServletRequest request, HttpServletResponse response , User user){
        //参数过滤
        if (user==null){
            request.setAttribute("msg","参数错误");
            return "successAndGo";
        }
        //先取到cookie
        String userKey = null;
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies){
            if ("user_key".equals(cookie.getName())){
                userKey = cookie.getValue();
            }
        }
        String result = loginService.dologin(user.getUserName(),user.getPassword());
        if ("success".equals(result)){
            //令牌ID存入redis
            userCacheService.addOrUpdate(userKey,user);
            System.out.println(userCacheService.load(userKey).getUserName());
            return "redirect:index";
        }else if("error".equals(result)){
            request.setAttribute("msg", LoginConstant.LOGIN_FAILED_MSG);
            return "successAndGo";
        }else {
            request.setAttribute("msg","登录失败，稍后再试");
            return "successAndGo";
        }
    }

    @RequestMapping(value = "index")
    public String index(HttpServletRequest request){
        String user_key = null;
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies){
            System.out.println(cookie.getName()+";"+cookie.getValue());
        }
        return "index";
    }
    @RequestMapping(value = "home")
    public String home(){
        return "home";
    }
}
