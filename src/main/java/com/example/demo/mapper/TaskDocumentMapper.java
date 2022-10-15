package com.example.demo.mapper;

import com.example.demo.model.TaskDocument;

public interface TaskDocumentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TaskDocument record);

    int insertSelective(TaskDocument record);

    TaskDocument selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TaskDocument record);

    int updateByPrimaryKey(TaskDocument record);
}