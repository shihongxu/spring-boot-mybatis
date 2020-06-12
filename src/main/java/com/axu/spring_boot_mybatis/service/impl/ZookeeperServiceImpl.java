package com.axu.spring_boot_mybatis.service.impl;

import com.axu.spring_boot_mybatis.service.ZookeeperService;
import org.I0Itec.zkclient.ZkClient;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.ZooKeeper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName ZookeeperServiceImpl
 * @Description TODO
 * @Author Axu
 * @Date 2020/6/11 16:08
 * @Version 1.0
 */
@Service
public class ZookeeperServiceImpl implements ZookeeperService {

//    @Autowired
//    ZooKeeper zooKeeper;

    @Override
    public String testZookeeper() {

        ZkClient zkClient = new ZkClient("192.168.28.137:2181,192.168.28.137:2182,192.168.28.137:2183");
        zkClient.setZkSerializer(new MyZkSerializer());

        zkClient.create("/zk/appSpringboot3", "springboot2", CreateMode.PERSISTENT);

        System.out.println("test=====================");
        return "";
    }
}
