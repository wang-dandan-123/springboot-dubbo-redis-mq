package com.peiyuwang.springbootdubboredismq.service;

import com.peiyuwang.springbootdubboredismq.entity.TUser;
import org.springframework.stereotype.Repository;

/**
 * @author wang
 * @create 2021-08-04 下午 6:35
 */
public interface TUserService {
    public TUser getById(int id);
}
