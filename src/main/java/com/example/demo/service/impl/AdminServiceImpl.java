package com.example.demo.service.impl;

import com.example.demo.dao.AdminDao;
import com.example.demo.domain.Admin;
import com.example.demo.service.AdminService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Transactional
@Service
public class AdminServiceImpl implements AdminService {
    @Resource
    AdminDao adminDao;

    @Override
    public Admin Login(Admin admin) {
        return adminDao.Login(admin);
    }
}
