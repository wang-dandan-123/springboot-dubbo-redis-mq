package com.peiyuwang.springbootdubboredismq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackages = "com.peiyuwang.springbootdubboredismq.*")//将mapper管理起来
@SpringBootApplication
public class SpringbootDubboRedisMqApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDubboRedisMqApplication.class, args);
    }

}
