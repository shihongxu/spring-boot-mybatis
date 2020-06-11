package com.axu.spring_boot_mybatis.service.impl;

import com.axu.spring_boot_mybatis.service.RedisTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * @ClassName RedisTestServiceImpl
 * @Description TODO
 * @Author Axu
 * @Date 2020/6/4 15:32
 * @Version 1.0
 */
@Service
public class RedisTestServiceImpl implements RedisTestService {

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public String hashRedisType() {
        String result = "true";

        redisTemplate.opsForHash().put("user1", "name", "阿徐");

        HashMap<String, String> map = (HashMap<String, String>)redisTemplate.opsForHash().entries("user1");


        System.out.println("获取的hashmap 值是： " + map.toString());

        return result;
    }

    @Override
    public List<Object> listRedisType() {

        redisTemplate.opsForList().rightPush("list:key1","listValue1");
        redisTemplate.opsForList().rightPush("list:key1", "listvalue2" );

        Object popList = (Object) redisTemplate.opsForList().rightPop("list:key1");

        List<String> getList = redisTemplate.opsForList().range("list:key1", 1, 3);


        Long size = redisTemplate.opsForList().size("list:key1");

        System.out.println("获取的list 的值是：" + getList.toString());

        return null;
    }

    @Override
    public List<Object> setRedisType() {

        redisTemplate.opsForSet().add("set:user1", "user1", "user1", "user3");
        redisTemplate.opsForSet().add("set:user2", "user3", "user4", "uesr5", "user6");

        Long size = redisTemplate.opsForSet().size("set:user1");

        Set<String> redisSet = redisTemplate.opsForSet().members("set:user2");

        System.out.println("获取set 的值是：" + redisSet.toString());

        return null;
    }
}
