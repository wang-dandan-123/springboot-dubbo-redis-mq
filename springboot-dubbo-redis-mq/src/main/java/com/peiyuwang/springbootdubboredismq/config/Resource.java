package com.peiyuwang.springbootdubboredismq.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author wang
 * @create 2021-08-01 下午 7:12
 */
@Component
@ConfigurationProperties(prefix ="resource")
public class Resource {

    //@Value("${resource.imageserver}")
    private String imageServer;
   // @Value("${resource.emailserver}")
    private String emailServer;

    public String getImageServer() {
        return imageServer;
    }

    public void setImageServer(String imageServer) {
        this.imageServer = imageServer;
    }

    public String getEmailServer() {
        return emailServer;
    }

    public void setEmailServer(String emailServer) {
        this.emailServer = emailServer;
    }
}
