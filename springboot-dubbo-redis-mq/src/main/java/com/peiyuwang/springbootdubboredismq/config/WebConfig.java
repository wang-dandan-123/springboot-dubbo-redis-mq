package com.peiyuwang.springbootdubboredismq.config;

import com.peiyuwang.springbootdubboredismq.filter.MyFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wang
 * @create 2021-08-01 下午 7:54
 */
@Configuration
public class WebConfig {
    @Autowired
    private MyFilter myFilter;

    @Bean
    public FilterRegistrationBean init(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(myFilter);
        filterRegistrationBean.setName("MyFilter");
        filterRegistrationBean.addUrlPatterns("/*");
        return filterRegistrationBean;
    }
}
