package com.ruitesen.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.ruitesen.springboot.pojo.Category;

@Mapper
public interface CategoryMapper {

    @Select("select * from FJBHQ")
    List<Category> findAll();


}