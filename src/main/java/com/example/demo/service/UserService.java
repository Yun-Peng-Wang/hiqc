package com.example.demo.service;

import com.example.demo.dao.UserDAO;
import com.example.demo.entity.SysUserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDAO userDAO;

    public boolean isExist(String userName) {
        SysUserEntity user = getByName(userName);
        return null!=user;
    }

    public SysUserEntity getByName(String userName) {
        return userDAO.findByUserName(userName);
    }

    public SysUserEntity get(String userName, String password){
        return userDAO.getByUserNameAndPassword(userName, password);
    }

    public void add(SysUserEntity user) {
        userDAO.save(user);
    }
}
