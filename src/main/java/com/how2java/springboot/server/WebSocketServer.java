package com.how2java.springboot.server;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.websocket.OnClose;
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
		System.out.println(username+"加入,当前在线人数:"+ getOnlineCount());
		try {
			this.session.getBasicRemote().sendText("连接成功");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 连接关闭调用方法
	 */
	@OnClose
	public void onClose() {
		// 从set中出去
		users.remove(this.username);
		subOnlineCount();
		System.out.println("一个连接关闭,当前在线:"+ getOnlineCount());
	}
	
	/**
	 * 减少在线人数
	 */
	private static synchronized void subOnlineCount() {
		WebSocketServer.onlineCount--;
	}
	
	private int getOnlineCount() {
		 return onlineCount;
	}

	/**
	 * 增加在线人数;
	 */
	private  static synchronized void addOnlineCount() {
		WebSocketServer.onlineCount++;
	}
}
