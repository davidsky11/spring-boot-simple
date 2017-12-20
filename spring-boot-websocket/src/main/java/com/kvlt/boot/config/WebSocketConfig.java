package com.kvlt.boot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

/**
 * WebSocketConfig
 * 配置 WebSocket，需要在配置类上使用 @EnableWebSocketMessageBroker 开启 WebSocket 支持，
 *      并通过继承 AbstractWebSocketMessageBrokerConfigurer 类，重写其方法来配置 WebSocket
 *
 *  1、通过 @EnableWebSocketMessageBroker 开启 STOMP 协议来传输基于代理（message broker）的消息，
 *      这时控制器支持使用 @MessageMapping，就像使用 @RequestMapping 一样
 *  2、注册 STOMP 协议的节点（endpoint），并映射指定的URL
 *  3、注册一个 STOMP 的 endpoint，并指定使用 SockJS 协议
 *  4、配置消息代理（Message Broker）
 *  5、广播式应配置一个 /topic 消息代理
 * @author KVLT
 * @date 2017-12-20.
 */
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer {

    @Override
    public void registerStompEndpoints(StompEndpointRegistry stompEndpointRegistry) {
        stompEndpointRegistry.addEndpoint("/endpointWS").withSockJS();
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.enableSimpleBroker("/topic");
    }

}
