package com.peiyuwang.springbootdubboredismq.controller;


import com.peiyuwang.springbootdubboredismq.config.Resource;
import com.peiyuwang.springbootdubboredismq.entity.TUser;
import com.peiyuwang.springbootdubboredismq.entity.User;
import com.peiyuwang.springbootdubboredismq.service.impl.TUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author wang
 * @create 2021-08-01 下午 1:46
 */
@RestController//@Controller+@ResponseBody
@RequestMapping("user")
public class UserController {

   /* @Value("${image.server}")
    private String imageServer;*/
    @Autowired
    private TUserServiceImpl tUserService;

    @Autowired
    private Resource resource;




    @RequestMapping("hello")
    public String hello(){
        return "hello,SpringBoot";
    }

    @GetMapping("getImageServer")
    public String getImageServer()
    {
        return resource.getImageServer();
    }


//restful风格的接口，由请求的方法确定；url+requestMethod
    @GetMapping("{id}")
    public TUser getById(@PathVariable("id") int id){
        System.out.println("id="+id);
        System.out.println("查询操作");
       // return new User(id,"java1997",new Date());
        return tUserService.getById(id);
    }
    @DeleteMapping("{id}")//请求Delete走这个方法
            public String delById(@PathVariable("id") Long id){

        System.out.println("id="+id);
        System.out.println("查询操作");
        return "ok";
    }
    @PostMapping("add")
    public String add(User user){
        System.out.println(user.getEntryDate());
        return "ok";
    }

}
