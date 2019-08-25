package com.itheima.mapper;

import com.itheima.domain.User;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;


import java.util.List;
@Component
@Mapper
public interface UserMapper {
    List<User> queryUserList();
}
