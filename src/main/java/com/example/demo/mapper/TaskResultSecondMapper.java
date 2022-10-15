package com.example.demo.mapper;

import com.example.demo.model.TaskResultSecond;

public interface TaskResultSecondMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TaskResultSecond record);

    int insertSelective(TaskResultSecond record);

    TaskResultSecond selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TaskResultSecond record);

    int updateByPrimaryKey(TaskResultSecond record);
}