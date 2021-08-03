package com.peiyuwang.springbootdubboredismq.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author wang
 * @create 2021-08-01 下午 7:55
 */
@Component
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Myfilter init...");
    }

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Myfilter doFilter...");
        //决定是否放行
        //filterChain.doFilter(servletRequest,servletResponse);
    }
}
