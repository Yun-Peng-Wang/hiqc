package com.example.demo.mapper;

import com.example.demo.model.ScoreSecond;

public interface ScoreSecondMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ScoreSecond record);

    int insertSelective(ScoreSecond record);

    ScoreSecond selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ScoreSecond record);

    int updateByPrimaryKey(ScoreSecond record);
}