package com.peiyuwang.springbootdubboredismq.interceptor;

import com.peiyuwang.springbootdubboredismq.config.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author wang
 * @create 2021-08-03 下午 6:46
 */
@Component
public class MyInterceptor implements HandlerInterceptor {
    @Autowired
    private Resource resource;
//预处理


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("MyInterceptor preHandle");
        System.out.println(resource.getImageServer());
        return true;//是否放行
    }
}
