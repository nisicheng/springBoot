package com.example.demo.dao;

import com.example.demo.entity.Dictionarytype;

public interface DictionarytypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Dictionarytype record);

    int insertSelective(Dictionarytype record);

    Dictionarytype selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Dictionarytype record);

    int updateByPrimaryKey(Dictionarytype record);
}