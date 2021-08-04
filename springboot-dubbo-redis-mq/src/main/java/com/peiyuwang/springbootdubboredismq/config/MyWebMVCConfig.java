package com.peiyuwang.springbootdubboredismq.config;

import com.peiyuwang.springbootdubboredismq.interceptor.MyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author wang
 * @create 2021-08-03 下午 6:53
 */
@Configuration
public class MyWebMVCConfig implements WebMvcConfigurer {
    @Autowired
    private MyInterceptor myInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //添加拦截器配置
        registry.addInterceptor(myInterceptor).addPathPatterns("/**");
    }
}
