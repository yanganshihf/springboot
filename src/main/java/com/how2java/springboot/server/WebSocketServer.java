package com.how2java.springboot.server;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

import org.springframework.stereotype.Component;

@ServerEndpoint("/websocket/{userId}")
@Component
public class WebSocketServer {
	// 当前的连接数
	private static int onlineCount = 0;
	
	// 创建一个线程 安全的map
	private static HashMap hashMap = new HashMap();
	private static Map<String,WebSocketServer> users = Collections.synchronizedMap(hashMap);
	
	// 与某个客户端连接的会话,需要通过它给客户端发送数据
	private Session session;
	// 放入map中的key,用来表示连接对象
	private String username;
	
	/**
	 * 成功调用方法
	 */
	@OnOpen
	public void onOpen(Session session,@PathParam("userId") String username) {
		this.session = session;
		this.username = username;
		users.put(username, this);
		
		// 在线人数加1
		addOnlineCount();
	}
	
	/**
	 * 增加在线人数;
	 */
	private  static synchronized void addOnlineCount() {
		WebSocketServer.onlineCount++;
	}
}
