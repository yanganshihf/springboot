package com.ruitesen.demo.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ruitesen.demo.mapper.AdmincodeMapper;
import com.ruitesen.demo.mapper.UserMapper;
import com.ruitesen.demo.mapper.UserRoleMapper;
import com.ruitesen.demo.model.Admincode;
import com.ruitesen.demo.model.JqgridPageResp;
import com.ruitesen.demo.model.JzfpSysuserroleKey;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired 
	UserMapper userMapper;
	@Autowired
	AdmincodeMapper admincodeMapper;
	@Autowired
	UserRoleMapper userRoleMapper;
	
	
	@RequestMapping("/login")
	@ResponseBody
    public JqgridPageResp<com.ruitesen.demo.model.JzfpSysuser> login(Model m,String username,String password,HttpSession session) throws Exception {
		JqgridPageResp<com.ruitesen.demo.model.JzfpSysuser> resp = new JqgridPageResp<com.ruitesen.demo.model.JzfpSysuser>();
		// System.out.println(username+": "+password);
		List<com.ruitesen.demo.model.JzfpSysuser> findAll = userMapper.findAll(username, password);
        // System.out.println(findAll.isEmpty());
        if (findAll.isEmpty()) {
        	resp.setMsg("用户名或密码错误!");
		}else {
			resp.setMsg("登陆成功");
			
			// 存储用户信息
			session.setAttribute("departmentCode", findAll.get(0).getDepartmentcode());
            session.setAttribute("user", findAll.get(0));
            HashMap<String, String> adminCodeMap = new HashMap<String, String>();
            HashMap<String, String> userRoleMap = new HashMap<String, String>();
            
            List<Admincode> findAlladminCode = admincodeMapper.findAll();
            List<JzfpSysuserroleKey> allUserRole = userRoleMapper.getAll();
            
            for (Admincode admincode : findAlladminCode) {
	        	adminCodeMap.put(admincode.getAdmincode(),admincode.getAdminname());
			}
            for (JzfpSysuserroleKey jzfpSysuserroleKey : allUserRole) {
            	userRoleMap.put(jzfpSysuserroleKey.getUser_id(), jzfpSysuserroleKey.getRole_id());
			}
            
            session.setAttribute("departmentName",adminCodeMap.get(findAll.get(0).getDepartmentcode()));
            findAll.get(0).setDepartmentname(adminCodeMap.get(findAll.get(0).getDepartmentcode()));
            
            switch (userRoleMap.get(findAll.get(0).getId())) {
				case "0":
					session.setAttribute("userRole","超级管理员");
					break;
				case "1":
					session.setAttribute("userRole","省级用户");
					break;
				case "2":
					session.setAttribute("userRole","市级用户");
					break;
				case "3":
					session.setAttribute("userRole","县级用户");
					break;
				default:
			}
            System.out.println("用户信息: "+userRoleMap.get(findAll.get(0).getId())+"-------"+adminCodeMap.get(findAll.get(0).getDepartmentcode()));
            // session.setAttribute("departmentName", findAll.get(0).getName());
	        // session.setAttribute("userRole", findAll.get(0).getRole());
	    }
        resp.setRows(findAll);
        return resp;
    }
}
