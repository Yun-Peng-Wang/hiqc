package com.example.demo.mapper;

import com.example.demo.model.TaskFirst;

public interface TaskFirstMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TaskFirst record);

    int insertSelective(TaskFirst record);

    TaskFirst selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TaskFirst record);

    int updateByPrimaryKeyWithBLOBs(TaskFirst record);

    int updateByPrimaryKey(TaskFirst record);
}