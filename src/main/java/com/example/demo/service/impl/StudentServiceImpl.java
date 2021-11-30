package com.example.demo.service.impl;

import com.example.demo.dao.StudentDao;
import com.example.demo.domain.Student;
import com.example.demo.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
public class StudentServiceImpl implements StudentService {
    @Resource
    StudentDao studentDao;
    @Override
    public void deleteStudent(int sid) {
        studentDao.deleteStudent(sid);
    }

    @Override
    public void editStudent(Student student) {
        studentDao.editStudent(student);
    }

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }

    @Override
    public void AddStudent(Student student) {
        studentDao.AddStudent(student);
    }

    @Override
    public Student findBySid(int sid) {
        return studentDao.findBySid(sid);
    }
}
