package com.example.demo.dao;


import com.example.demo.entity.User;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface UserDao {

     User createUser(User user);
     User updateUser(User user);
     void deleteUser(Long userId);

    User findOne(Long userId);

    List<User> findAll(User user);

    User findByUsername(String username);

}
