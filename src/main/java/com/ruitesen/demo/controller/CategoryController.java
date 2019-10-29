package com.ruitesen.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ruitesen.demo.mapper.CategoryMapper;
import com.ruitesen.demo.model.Category;

@Controller
public class CategoryController {
	@Autowired CategoryMapper categoryMapper;
	
	@RequestMapping("/listCategory")
    public String listCategory(Model m) throws Exception {
        List<Category> cs=categoryMapper.findAll();
          
        m.addAttribute("cs", cs);
    
        return "listCategory";
    }
	
	@RequestMapping("/login")
    public String login(Model m) throws Exception {
		
        return "login";
    }
}
