package com.ruitesen.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
	@Select("select * from Jzfp_SysUser\r\n"
			+ "where name like #{0} and password like #{1}")
    List<com.ruitesen.demo.model.JzfpSysuser> findAll(String username,String password);
}
