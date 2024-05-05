package com.hashtenki.autowired.service;

import com.hashtenki.autowired.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    //注入dao
    //第一种，属性注入
    @Autowired
    private UserDao userDao;

    @Override
    public void add() {
        System.out.println("Service add...");
        userDao.add();
    }
}
