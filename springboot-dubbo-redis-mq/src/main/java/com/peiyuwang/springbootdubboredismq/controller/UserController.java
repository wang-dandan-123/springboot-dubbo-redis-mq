package com.peiyuwang.springbootdubboredismq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wang
 * @create 2021-08-01 下午 1:46
 */
@RestController//@Controller+@ResponseBody
@RequestMapping("user")
public class UserController {
    @RequestMapping("hello")
    public String hello(){
        return "hello,SpringBoot";
    }
}
