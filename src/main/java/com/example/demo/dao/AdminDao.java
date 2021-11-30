package com.example.demo.dao;

import com.example.demo.domain.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AdminDao {
    @Select("select *from admin where username=#{username} and password=#{password}")
    Admin Login(Admin admin);
}
