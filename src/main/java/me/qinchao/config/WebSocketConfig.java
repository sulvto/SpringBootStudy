package me.qinchao.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.BinaryMessage;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by sulvto on 16-5-17.
 */
@Configuration
public class WebSocketConfig implements WebSocketConfigurer {


    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(new SocketHandler(), "/ws").withSockJS();
    }

    class SocketHandler extends TextWebSocketHandler {

        private Map<String, WebSocketSession> webSocketSessionMap = new ConcurrentHashMap<>();

        @Override
        public void afterConnectionEstablished(WebSocketSession session) throws Exception {
            webSocketSessionMap.put(session.getId(), session);
        }

        @Override
        protected void handleBinaryMessage(WebSocketSession session, BinaryMessage message) {
            super.handleBinaryMessage(session, message);
        }

        @Override
        public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
            webSocketSessionMap.remove(session.getId());
        }
    }


}
