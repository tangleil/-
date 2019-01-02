package com.dao;

import com.domain.Police;

public interface PoliceMapper {
    int deleteByPrimaryKey(Integer policeId);

    int insert(Police record);

    int insertSelective(Police record);

    Police selectByPrimaryKey(Integer policeId);

    int updateByPrimaryKeySelective(Police record);

    int updateByPrimaryKey(Police record);
}