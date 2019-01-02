package com.dao;

import com.domain.Information;

public interface InformationMapper {
    int deleteByPrimaryKey(Integer infId);

    int insert(Information record);

    int insertSelective(Information record);

    Information selectByPrimaryKey(Integer infId);

    int updateByPrimaryKeySelective(Information record);

    int updateByPrimaryKey(Information record);
}