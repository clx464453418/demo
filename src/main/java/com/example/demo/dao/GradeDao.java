package com.example.demo.dao;

import com.example.demo.domain.Grade;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface GradeDao {
    @Select("select *from grade")
    List<Grade>findAll();
    @Insert("insert into grade(course_one,course_two,course_three,sname)value(#{course_one},#{course_two},#{course_three},#{sname})")
    void addGrade(Grade grade);
    @Delete("delete from grade where gid=#{gid}")
    void deleteGrade(int gid);
    @Update("update grade set course_one=#{course_one},course_two=#{course_two},course_three=#{course_three} where gid =#{gid} ")
    void editGrade(Grade grade);
    @Select("select *from grade where gid=#{gid}")
    Grade findByGid(int gid);
}
