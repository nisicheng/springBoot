package com.example.demo.dao;

import com.example.demo.entity.Articletype;

public interface ArticletypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Articletype record);

    int insertSelective(Articletype record);

    Articletype selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Articletype record);

    int updateByPrimaryKey(Articletype record);
}