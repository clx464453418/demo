package com.example.demo.service.impl;

import com.example.demo.dao.GradeDao;
import com.example.demo.domain.Grade;
import com.example.demo.service.GradeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Transactional
@Service
public class GradeServiceImpl implements GradeService {
    @Resource
    GradeDao gradeDao;

    @Override
    public List<Grade> findAll() {
        return gradeDao.findAll();
    }

    @Override
    public void addGrade(Grade grade) {
            gradeDao.addGrade(grade);
    }

    @Override
    public void deleteGrade(int gid) {
            gradeDao.deleteGrade(gid);
    }

    @Override
    public void editGrade(Grade grade) {
            gradeDao.editGrade(grade);
    }

    @Override
    public Grade findByGid(int gid) {
        return gradeDao.findByGid(gid);
    }
}
