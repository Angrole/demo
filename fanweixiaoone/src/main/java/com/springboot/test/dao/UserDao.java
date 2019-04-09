package com.springboot.test.dao;


import com.springboot.test.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {


    User findUserById(String userId);

    //新增用户
    int insertUser(User user);

}
