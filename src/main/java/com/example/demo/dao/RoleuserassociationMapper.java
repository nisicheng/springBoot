package com.example.demo.dao;

import com.example.demo.entity.Roleuserassociation;

public interface RoleuserassociationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Roleuserassociation record);

    int insertSelective(Roleuserassociation record);

    Roleuserassociation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Roleuserassociation record);

    int updateByPrimaryKey(Roleuserassociation record);
}