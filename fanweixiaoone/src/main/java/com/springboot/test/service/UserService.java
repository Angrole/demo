package com.springboot.test.service;
import com.springboot.test.dao.UserDao;
import com.springboot.test.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by liuzehai on 2017/12/19.
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User findUserById(String userId){
        return userDao.findUserById(userId);
    }

    public void  insertUser(User user){
        userDao.insertUser(user);
    }
}
