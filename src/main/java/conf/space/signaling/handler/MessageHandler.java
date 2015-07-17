/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conf.space.signaling.handler;

import com.google.gson.Gson;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

/**
 * WebSocket MessageHandler
 * @author minamoto
 */
@Component
public class MessageHandler extends TextWebSocketHandler {
    /**
     * Invoked when a new WebSocket Text message arrives.
     * @param session WebSocket session
     * @param message Text message
     */
    @Override
    public void handleTextMessage(WebSocketSession session,
            TextMessage message) {
        Gson gson = new Gson();
        
    }
    /**
     * Invoked after the WebSocket connection has been closed by either side,
     * or after a transport error has occurred. 
     * @param session   WebSocket session
     * @param status    Close status
     */
    @Override
    public void afterConnectionClosed(WebSocketSession session, 
            CloseStatus status) {
        
    }
}
