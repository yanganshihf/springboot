package com.ruitesen.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AdmincodeMapper {
	@Select("select *\r\n"
			+ "from AdminCode")
	List<com.ruitesen.demo.model.Admincode> findAll();
}
