package com.example.demo.mapper;

import com.example.demo.model.TaskRecordSecond;

public interface TaskRecordSecondMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TaskRecordSecond record);

    int insertSelective(TaskRecordSecond record);

    TaskRecordSecond selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TaskRecordSecond record);

    int updateByPrimaryKey(TaskRecordSecond record);
}