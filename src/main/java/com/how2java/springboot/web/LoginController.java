package com.how2java.springboot.web;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.how2java.springboot.server.WebSocketServer;

@RestController
public class LoginController {
	@Autowired
	WebSocketServer server;
	@PostMapping("/login")
    public String login(String username,String password) throws IOException {
        //TODO: 校验密码
        server.sendInfo(username + "进入了聊天室!");
        return username;
    }
}
