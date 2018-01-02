package com.solace.websocket.config;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor;

import java.util.Map;

/**
 * Created by solace on 2017/2/9.
 * function use
 */
@Component
public class HandshakeInterceptor extends HttpSessionHandshakeInterceptor{

    /**
     * 重写方法，处理ios浏览器兼容性问题
     * @param request
     * @param response
     * @param wsHandler
     * @param attributes
     * @return
     * @throws Exception
     */
    @Override
    public boolean beforeHandshake(ServerHttpRequest request,
                                   ServerHttpResponse response, WebSocketHandler wsHandler,
                                   Map<String, Object> attributes) throws Exception {
        //解决iOS手机safari浏览器版本问题
        if (request.getHeaders().containsKey("Sec-WebSocket-Extensions")){
            request.getHeaders().set("Sec-WebSocket-Extensions","permessage-deflate");
        }
        System.out.println("Before Handshake");
        return super.beforeHandshake(request,response,wsHandler,attributes);
    }

}
