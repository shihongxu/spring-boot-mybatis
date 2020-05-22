package com.axu.spring_boot_mybatis.service.impl;

import com.axu.spring_boot_mybatis.entity.User;
import com.axu.spring_boot_mybatis.mapper.UserDao;
import com.axu.spring_boot_mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public List<User> getUser() {

        List<User> usersList = userDao.getUser();

        return userDao.getUser();
    }
}
