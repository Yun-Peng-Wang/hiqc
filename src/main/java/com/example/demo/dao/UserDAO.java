package com.example.demo.dao;

import com.example.demo.entity.SysUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<SysUserEntity,Integer> {
    SysUserEntity findByUserName(String userName);
    SysUserEntity getByUserNameAndPassword(String userName,String password);
}
