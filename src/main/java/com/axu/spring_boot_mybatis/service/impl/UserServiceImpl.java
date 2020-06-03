package com.axu.spring_boot_mybatis.service.impl;

import com.axu.spring_boot_mybatis.entity.User;
import com.axu.spring_boot_mybatis.mapper.UserDao;
import com.axu.spring_boot_mybatis.service.UserService;
import com.axu.spring_boot_mybatis.util.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private RedisUtils redisUtils;

    @Override
    public List<User> getUser() {

        List<User> usersList = userDao.getUser();
        String key = "user_id2";
        String value = "usertest11";

        redisUtils.set(key,value);

        redisTemplate.opsForValue().set("user_id3", "testredis");

        Object keyValue = redisUtils.get("user_id2");
        Object keyValue3 = redisUtils.get("user_id3");

        System.out.println("keyvalue:" + keyValue + "===========keyValue3" + keyValue3);
        return usersList;
    }
}
