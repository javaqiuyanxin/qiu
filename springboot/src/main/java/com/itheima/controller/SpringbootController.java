package com.itheima.controller;


import com.itheima.domain.User;
import com.itheima.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
//添加注释
@Controller
public class SpringbootController {
    @Autowired
   private UserMapper userMapper;
    @RequestMapping("/quick")
    @ResponseBody
    public List<User> quick(){
        List<User> users = userMapper.queryUserList();
        return users;
    }
}
