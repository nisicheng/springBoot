package com.example.demo.dao;

import com.example.demo.entity.Rolefunction;

public interface RolefunctionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Rolefunction record);

    int insertSelective(Rolefunction record);

    Rolefunction selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Rolefunction record);

    int updateByPrimaryKey(Rolefunction record);
}