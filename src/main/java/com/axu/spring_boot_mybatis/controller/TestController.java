package com.axu.spring_boot_mybatis.controller;

import com.axu.spring_boot_mybatis.entity.User;
import com.axu.spring_boot_mybatis.service.RedisTestService;
import com.axu.spring_boot_mybatis.service.impl.RedisTestServiceImpl;
import com.axu.spring_boot_mybatis.service.impl.UserServiceImpl;
import com.axu.spring_boot_mybatis.service.impl.ZookeeperServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private RedisTestServiceImpl  redisTestService;

    @Autowired
    private ZookeeperServiceImpl zookeeperService;

    /**
     * @Author Axu
     * @Description //TODO  * @Date 12:14 2020/5/20
     * @Param * @param 
     * @return java.util.List<com.axu.spring_boot_mybatis.entity.User>
     **/
    @RequestMapping("/getusers")
    public List<User> getUser(){
        List<User> usersList = userService.getUser();
        for(User uesr : usersList){
            String userString = uesr.toString();
            System.out.println("userString: " + userString);
        }

        return usersList;
    }

    /**
     * @Author Axu
     * @Description //TODO 测试redis * @Date 16:16 2020/6/11
     * @Param * @param
     * @return java.lang.Object
     **/
    @GetMapping(value = "/testRedis")
    public Object testRedis(){

        //hash
//        redisTestService.hashRedisType();

        //list
//        redisTestService.listRedisType();

        redisTestService.setRedisType();

        return "111";
    }


    @GetMapping("/testzookeeper")
    public String testZookeeper(){
        String result = "true";

        zookeeperService.testZookeeper();

        return result;
    }
}
