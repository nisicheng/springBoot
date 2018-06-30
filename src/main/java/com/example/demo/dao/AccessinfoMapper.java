package com.example.demo.dao;

import com.example.demo.entity.Accessinfo;

public interface AccessinfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Accessinfo record);

    int insertSelective(Accessinfo record);

    Accessinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Accessinfo record);

    int updateByPrimaryKey(Accessinfo record);
}