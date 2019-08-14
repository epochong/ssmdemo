package com.ming.service;

import com.ming.mapper.UserMapper;
import com.ming.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> queryUserService() throws Exception {
        //没有实现类，通过Spring动态代理的方式获取对象执行的方法
        return userMapper.queryUserList();
    }
}
