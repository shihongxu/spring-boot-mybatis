package com.axu.spring_boot_mybatis.service;

import java.util.List;

/**
 * @ClassName RedisTestService
 * @Description TODO
 * @Author Axu
 * @Date 2020/6/4 15:31
 * @Version 1.0
 */
public interface RedisTestService {

    /**
     * @Author Axu
     * @Description //TODO 测试redis hash 类型 * @Date 15:58 2020/6/4
     * @Param * @param 
     * @return java.lang.String
     **/
    String hashRedisType();

    /**
     * @Author Axu
     * @Description //TODO list数据类型 * @Date 16:12 2020/6/4
     * @Param * @param 
     * @return java.util.List<java.lang.Object>
     **/
    List<Object> listRedisType();

    /**
     * @Author Axu
     * @Description //TODO set 数据类型 * @Date 16:46 2020/6/4
     * @Param * @param 
     * @return java.util.List<java.lang.Object>
     **/
    List<Object> setRedisType();
}
