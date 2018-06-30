package com.example.demo.dao;

import com.example.demo.entity.Articlefileassociation;

public interface ArticlefileassociationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Articlefileassociation record);

    int insertSelective(Articlefileassociation record);

    Articlefileassociation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Articlefileassociation record);

    int updateByPrimaryKey(Articlefileassociation record);
}