package com.example.demo.service;

import com.example.demo.entity.Permission;

import java.util.List;

/**
 * Created by HP on 2018/5/3.
 */
public interface PermissionService {
    Permission getById(Integer id);

    Integer create(Permission permission);

    int update(Permission permission);

    int delete(Integer id);

    List<Permission> getList();

    List<Permission> getByUserId(Integer userId);
}
