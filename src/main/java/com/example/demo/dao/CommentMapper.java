package com.example.demo.dao;

import com.example.demo.entity.Comment;

public interface CommentMapper {
    int insert(Comment record);

    int insertSelective(Comment record);
}