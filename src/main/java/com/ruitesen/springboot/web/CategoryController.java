package com.ruitesen.springboot.web;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ruitesen.springboot.mapper.CategoryMapper;
import com.ruitesen.springboot.pojo.Category;
  
@Controller
public class CategoryController {
    @Autowired CategoryMapper categoryMapper;
     
    @RequestMapping("/listCategory")
    @ResponseBody
    public String listCategory() throws Exception {
        List<Category> cs=categoryMapper.findAll();
        return cs.toString();
    }
    
}