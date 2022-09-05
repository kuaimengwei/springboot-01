package com.atguigu.springboot.service.impl;

import com.atguigu.springboot.dao.UserMapper;
import com.atguigu.springboot.pojo.User;
import com.atguigu.springboot.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author KuaiMengWei
 * @Version V1.0.0
 * @Date 2022/9/5
 */
@Service
public class UserServiceImpl implements UserService {

    //构造器注入UserMapper
    private final UserMapper userMapper;
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User selectByPrimaryKey(Integer uid) {
        User user = userMapper.selectByPrimaryKey(uid);
        return user;
    }
}
