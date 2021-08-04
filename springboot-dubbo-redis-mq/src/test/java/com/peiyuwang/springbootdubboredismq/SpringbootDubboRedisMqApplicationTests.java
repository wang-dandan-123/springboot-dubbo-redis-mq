package com.peiyuwang.springbootdubboredismq;

import com.peiyuwang.springbootdubboredismq.entity.TUser;
import com.peiyuwang.springbootdubboredismq.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class SpringbootDubboRedisMqApplicationTests {
   @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        System.out.println("----selectAll method test----");
        List<TUser> iUsers = userMapper.selectList(null);
        for (TUser iuser : iUsers) {
            System.out.println(iuser);
        }
    }
}

