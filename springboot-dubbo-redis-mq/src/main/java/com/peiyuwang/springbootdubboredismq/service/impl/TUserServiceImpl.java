package com.peiyuwang.springbootdubboredismq.service.impl;

import com.peiyuwang.springbootdubboredismq.entity.TUser;
import com.peiyuwang.springbootdubboredismq.mapper.UserMapper;
import com.peiyuwang.springbootdubboredismq.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wang
 * @create 2021-08-04 下午 6:36
 */
@Service
public class TUserServiceImpl implements TUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public TUser getById(int id) {
        return userMapper.selectById(id);
    }
}
