package com.peiyuwang.springbootdubboredismq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wang
 * @create 2021-08-04 下午 7:15
 */
@Controller
@RequestMapping("page")
public class PageController {
    @GetMapping("hello")
    public String hello(){
        return "hello";

    }

}
