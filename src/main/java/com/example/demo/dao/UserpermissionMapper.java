package com.example.demo.dao;

import com.example.demo.entity.Userpermission;

public interface UserpermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Userpermission record);

    int insertSelective(Userpermission record);

    Userpermission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Userpermission record);

    int updateByPrimaryKey(Userpermission record);
}