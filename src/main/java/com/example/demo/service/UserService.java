package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

/**
 * Created by HP on 2018/1/25.
 */
public interface UserService
{
    User getById(Integer id);
    Integer create(User user);
    int update(User user);
    int delete(Integer id);
    User getByUserName(String userName);
}
