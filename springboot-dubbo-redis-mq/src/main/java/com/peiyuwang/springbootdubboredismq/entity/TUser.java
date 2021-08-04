package com.peiyuwang.springbootdubboredismq.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wang
 * @create 2021-08-03 下午 8:22
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TUser {
    private int id;
    private String name;
    private String password;
}
