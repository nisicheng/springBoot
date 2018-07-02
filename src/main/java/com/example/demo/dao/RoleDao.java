package com.example.demo.dao;


import com.example.demo.entity.Role;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RoleDao {

     Role createRole(Role role);
     Role updateRole(Role role);
     void deleteRole(Long roleId);

     Role findOne(Long roleId);
     List<Role> findAll();
}
