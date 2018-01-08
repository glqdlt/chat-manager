package com.glqdlt.chatmanager;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;


//https://spring.io/guides/gs/messaging-stomp-websocket/
@Configuration
@EnableWebSocketMessageBroker
public class WebSocksConfig extends AbstractWebSocketMessageBrokerConfigurer {

    @Override
    public void configureMessageBroker(MessageBrokerRegistry messageBrokerRegistry) {

        messageBrokerRegistry.enableSimpleBroker("/push");
        messageBrokerRegistry.setApplicationDestinationPrefixes("/app");

    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry stompEndpointRegistry) {
        // 모든 도메인에 대한 연결 허용 .setAllo~~("*")
        stompEndpointRegistry.addEndpoint("/webSocketHandler").setAllowedOrigins("*").withSockJS();
        // stompEndpointRegistry.addEndpoint("/webSocks").withSockJS();

    }

}
