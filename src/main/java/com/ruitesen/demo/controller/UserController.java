package com.ruitesen.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ruitesen.demo.mapper.UserMapper;
import com.ruitesen.demo.model.JqgridPageResp;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired 
	UserMapper userMapper;
	
	@RequestMapping("/login")
	@ResponseBody
    public JqgridPageResp<com.ruitesen.demo.model.JzfpSysuser> login(Model m,String username,String password) throws Exception {
		JqgridPageResp<com.ruitesen.demo.model.JzfpSysuser> resp = new JqgridPageResp<com.ruitesen.demo.model.JzfpSysuser>();
		System.out.println(username+": "+password);
		List<com.ruitesen.demo.model.JzfpSysuser> findAll = userMapper.findAll(username, password);
        System.out.println(findAll.isEmpty());
        if (findAll.isEmpty()) {
        	resp.setMsg("用户名或密码错误!");
		}else {
			resp.setMsg("登陆成功");
		}
        resp.setRows(findAll);
        return resp;
    }
}
