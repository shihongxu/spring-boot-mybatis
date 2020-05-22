package com.axu.spring_boot_mybatis.controller;

import com.axu.spring_boot_mybatis.entity.User;
import com.axu.spring_boot_mybatis.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
}
