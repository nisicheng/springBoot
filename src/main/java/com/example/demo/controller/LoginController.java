package com.example.demo.controller;

import com.example.demo.entity.User;
import org.apache.catalina.authenticator.SavedRequest;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


/**
 * Created by HP on 2018/5/3.
 */
@CrossOrigin
@RestController
public class LoginController {
    @RequestMapping(value = "/login")
    public String login(User user){

        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getName(), user.getPassword());
        System.out.println("11111");
        try {
           subject.login(token);
            return "ok";
        } catch (AuthenticationException e) {
           return "error";
        }
    }
    @RequestMapping(value = "/loguser")
    public User user(){
        User user=new User();
        user.setName("张三");
        user.setId(1);
        return  user;
    }
}
