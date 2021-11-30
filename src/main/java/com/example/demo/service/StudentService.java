package com.example.demo.service;

import com.example.demo.domain.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface StudentService {
    void deleteStudent(int sid);
    void editStudent(Student student);
    List<Student> findAll();
    void AddStudent(Student student);
    Student findBySid(int sid);
}
