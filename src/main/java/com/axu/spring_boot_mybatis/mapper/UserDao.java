package com.axu.spring_boot_mybatis.mapper;

import com.axu.spring_boot_mybatis.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    List<User> getUser();
}
