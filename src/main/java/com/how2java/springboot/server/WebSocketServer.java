package com.how2java.springboot.server;

import javax.websocket.server.ServerEndpoint;

import org.springframework.stereotype.Component;

@ServerEndpoint("/websocket/{userId}")
@Component
public class WebSocketServer {
	
}
