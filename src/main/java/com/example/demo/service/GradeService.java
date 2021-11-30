package com.example.demo.service;

import com.example.demo.domain.Grade;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface GradeService {
    List<Grade> findAll();
    void addGrade(Grade grade);
    void deleteGrade(int gid);
    void editGrade(Grade grade);
    Grade findByGid(int gid);
}
