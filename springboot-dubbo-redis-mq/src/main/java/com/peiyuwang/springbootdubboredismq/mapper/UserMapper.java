package com.peiyuwang.springbootdubboredismq.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.peiyuwang.springbootdubboredismq.entity.TUser;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author wang
 * @create 2021-08-03 下午 8:24
 */
@Mapper
public interface UserMapper extends BaseMapper<TUser> {
}
