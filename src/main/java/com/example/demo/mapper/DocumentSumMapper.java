package com.example.demo.mapper;

import com.example.demo.model.DocumentSum;

public interface DocumentSumMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DocumentSum record);

    int insertSelective(DocumentSum record);

    DocumentSum selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DocumentSum record);

    int updateByPrimaryKey(DocumentSum record);
}