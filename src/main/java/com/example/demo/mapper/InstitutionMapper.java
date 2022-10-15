package com.example.demo.mapper;

import com.example.demo.model.Institution;

public interface InstitutionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Institution record);

    int insertSelective(Institution record);

    Institution selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Institution record);

    int updateByPrimaryKey(Institution record);
}