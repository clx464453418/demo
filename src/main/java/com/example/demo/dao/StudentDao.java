package com.example.demo.dao;

import com.example.demo.domain.Student;
import lombok.Data;
import org.apache.ibatis.annotations.*;

import java.util.List;

//private int sid;
//private String sname;
//private String sex;
//private String class1;
//private String phone;
//private String QQ;
//private String address;
//private String dormitory;
@Mapper
public interface StudentDao {
    @Delete("delete from student where sid=#{sid}")
    void deleteStudent(int sid);
    @Update("update student set  sname=#{sname},sex=#{sex},class1=#{class1},phone=#{phone},QQ=#{QQ},address=#{address},dormitory=#{dormitory} where sid=#{sid} ")
    void editStudent(Student student);
    @Select("select *from student")
    List<Student>findAll();
    @Insert("insert into student(sname,sex,class1,phone,QQ,address,dormitory)value(#{sname},#{sex},#{class1},#{phone},#{QQ},#{address},#{dormitory})")
    void AddStudent(Student student);
    @Select("select *from student where sid=#{sid}")
    Student findBySid(int sid);

}
