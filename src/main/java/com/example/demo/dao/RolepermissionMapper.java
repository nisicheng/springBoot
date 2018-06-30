package com.example.demo.dao;

import com.example.demo.entity.Rolepermission;

public interface RolepermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Rolepermission record);

    int insertSelective(Rolepermission record);

    Rolepermission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Rolepermission record);

    int updateByPrimaryKey(Rolepermission record);
}