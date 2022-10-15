package com.example.demo.dao;

import com.example.demo.entity.TaskSumEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskDAO extends JpaRepository<TaskSumEntity, Integer> {
    //查找所有需要用列表接收
    List<TaskSumEntity> findAllByUserId(Integer userId);

}
