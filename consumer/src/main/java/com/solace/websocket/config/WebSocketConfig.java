package com.solace.websocket.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

/**
 * Created by solace on 2017/2/9.
 * function use for config websocket
 */
@Configuration
@EnableWebMvc
@EnableWebSocket
public class WebSocketConfig extends WebMvcConfigurerAdapter implements WebSocketConfigurer{

    public WebSocketConfig(){

    }

    /**
     * 注册广播
     * @param webSocketHandlerRegistry
     */
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry webSocketHandlerRegistry) {
        //setAllowedOrigins解决浏览器403的问题
        webSocketHandlerRegistry.addHandler(systemWebSocketHandler(),"/websck").addInterceptors(new HandshakeInterceptor()).setAllowedOrigins("*");
        System.out.println("registed");
        webSocketHandlerRegistry.addHandler(systemWebSocketHandler(),"/sockjs/websock").addInterceptors(new HandshakeInterceptor()).withSockJS();
    }

    /**
     * 引用自定义的websocketHandler
     * @return
     */
    @Bean
    public WebSocketHandler systemWebSocketHandler(){
        return new SystemWebSocketHandler();
    }
}
