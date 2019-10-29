package com.ruitesen.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CategoryMapper {
	@Select("select * from category_ ")
    List<com.ruitesen.demo.model.Category> findAll();
}
