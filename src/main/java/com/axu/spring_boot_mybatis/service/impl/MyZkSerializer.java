package com.axu.spring_boot_mybatis.service.impl;

import org.I0Itec.zkclient.exception.ZkMarshallingError;
import org.I0Itec.zkclient.serialize.ZkSerializer;

import java.io.UnsupportedEncodingException;

/**
 * @ClassName MyZkSerializer
 * @Description TODO
 * @Author Axu
 * @Date 2020/6/11 16:24
 * @Version 1.0
 */
public class MyZkSerializer implements ZkSerializer {
    @Override
    public byte[] serialize(Object o) throws ZkMarshallingError {
        String d = (String) o;

        try {
            return d.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Object deserialize(byte[] bytes) throws ZkMarshallingError {

        try {
            return new String(bytes, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return null;
    }
}
