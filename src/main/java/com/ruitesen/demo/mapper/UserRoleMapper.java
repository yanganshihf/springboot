package com.ruitesen.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserRoleMapper {
	@Select("select *\r\n"
			+ "from Jzfp_SysUserRole")
	List<com.ruitesen.demo.model.JzfpSysuserroleKey> getAll();
}
