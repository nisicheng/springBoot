package com.example.demo.dao;

import com.example.demo.entity.Dictionaryoptions;

public interface DictionaryoptionsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Dictionaryoptions record);

    int insertSelective(Dictionaryoptions record);

    Dictionaryoptions selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Dictionaryoptions record);

    int updateByPrimaryKey(Dictionaryoptions record);
}