package com.solace.websocket.config;

import org.springframework.web.socket.*;

/**
 * Created by solace on 2017/2/9.
 * function use for websocket redesign handle
 */
public class SystemWebSocketHandler implements WebSocketHandler{
    /**
     * 连接成功触发方法
     * @param webSocketSession
     * @throws Exception
     */
    @Override
    public void afterConnectionEstablished(WebSocketSession webSocketSession) throws Exception {
        System.out.println("socket connect......");
        webSocketSession.sendMessage(new TextMessage("connect ok!"));
    }

    /**
     * 消息处理，服务端接收消息
     * @param webSocketSession
     * @param webSocketMessage
     * @throws Exception
     */
    @Override
    public void handleMessage(WebSocketSession webSocketSession, WebSocketMessage<?> webSocketMessage) throws Exception {
        TextMessage returnMessage = new TextMessage(webSocketMessage.getPayload()+"received at server");
        System.out.println(webSocketSession.getHandshakeHeaders().getFirst("Cookie"));
        webSocketSession.sendMessage(returnMessage);
    }

    @Override
    public void handleTransportError(WebSocketSession webSocketSession, Throwable throwable) throws Exception {
        if (webSocketSession.isOpen()){
            webSocketSession.close();
        }
        System.out.println("websocket connection closed......");
    }

    @Override
    public void afterConnectionClosed(WebSocketSession webSocketSession, CloseStatus closeStatus) throws Exception {
        System.out.println("websocket connection closed......");
    }

    @Override
    public boolean supportsPartialMessages() {
        return false;
    }
}
