package com.example.demo.service;

import com.example.demo.entity.Role;

/**
 * Created by HP on 2018/5/3.
 */
public interface RoleService {
    Role getById(Integer id);
    Integer create(Role role);
    int update(Role role);
    int delete(Integer id);
}
