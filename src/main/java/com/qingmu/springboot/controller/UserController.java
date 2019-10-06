package com.qingmu.springboot.controller;

import com.qingmu.springboot.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @RequestMapping("hello")
    public String showHello(){
        return "hello world";
    }

    @RequestMapping("user")
    public User showUser(){
        User u = new User();
        u.setId(1);
        u.setUserName("青木");
        u.setBirthday(18);
        u.setSex("女");
        u.setAddress("家");

        return u;
    }

    @RequestMapping("maps")
    public Map<String, Object> showMap(){
        Map<String, Object> maps = new HashMap<>();
        maps.put("userName","木子");
        maps.put("userAge","18");

        return maps;
    }

    @RequestMapping("list")
    public List<User> showList(){
        List<User> lists = new ArrayList<>();
        User u = new User();
        u.setId(1);
        u.setUserName("青木");
        u.setBirthday(18);
        u.setSex("女");
        u.setAddress("家");
        lists.add(u);
        User u2 = new User();
        u2.setId(12);
        u2.setUserName("青木2");
        u2.setBirthday(182);
        u2.setSex("女2");
        u2.setAddress("家2");
        lists.add(u2);
        return lists;
    }


}
