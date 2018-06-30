package com.example.demo.dao;

import com.example.demo.entity.Auditrecords;

public interface AuditrecordsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Auditrecords record);

    int insertSelective(Auditrecords record);

    Auditrecords selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Auditrecords record);

    int updateByPrimaryKey(Auditrecords record);
}