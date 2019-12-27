package com.how2java.springboot.server;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
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
     * 收到客户端消息后触发的方法
     * @param message 客户端发送过来的消息
     */
    @OnMessage
    public void onMessage(String message) {
        System.out.println("来自客户端的消息:" + message);
        //群发消息
        try {
            if (StringUtils.isEmpty(message)){
                return ;
            }
            //如果给所有人发消息携带@ALL, 给特定人发消息携带@xxx@xxx#message
            String[] split = message.split("#");
            if (split.length>1){
                String[] users = split[0].split("@");
                if (users.length<2){return;}
                String firstuser = users[1].trim();
                if (StringUtils.isEmpty(firstuser)||"ALL".equals(firstuser.toUpperCase())){
                    String msg =username +": "+ split[1];
                    sendInfo(msg);//群发消息
                }else{//给特定人员发消息
                    for (String user : users) {
                        if (!StringUtils.isEmpty(user.trim())){
                            sendMessageToSomeBody(user.trim(),split[1]);
                        }
                    }
                }
            }else{
                sendInfo(username +": "+message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @OnError
    public void onError(Session session, Throwable error) {
    	System.out.println("发生错误 session: "+session);
        error.printStackTrace();
    }
    
    // 给特定人员发送消息
    public void sendMessageToSomeBody(String username,String message) throws IOException {
        if(users.get(username)==null){
            return;
        }
        users.get(username).session.getBasicRemote().sendText(message);
        this.session.getBasicRemote().sendText(this.username+"@"+username+": "+message);
    }

    /**
     * 群发自定义消息
     */
    public  void sendInfo(String message) throws IOException {
        for (WebSocketServer item : users.values()) {
            try {
                item.session.getBasicRemote().sendText(message);
            } catch (IOException e) {
                continue;
            }
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
