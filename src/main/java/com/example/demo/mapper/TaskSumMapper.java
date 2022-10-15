package com.example.demo.mapper;

import com.example.demo.model.TaskSum;

public interface TaskSumMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TaskSum record);

    int insertSelective(TaskSum record);

    TaskSum selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TaskSum record);

    int updateByPrimaryKey(TaskSum record);
}