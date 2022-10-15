package com.example.demo.mapper;

import com.example.demo.model.DocumentField;

public interface DocumentFieldMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DocumentField record);

    int insertSelective(DocumentField record);

    DocumentField selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DocumentField record);

    int updateByPrimaryKey(DocumentField record);
}