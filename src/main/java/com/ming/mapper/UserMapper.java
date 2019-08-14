package com.ming.mapper;

import com.ming.po.User;
import java.util.List;

/**
 * 没有实现类
 * 通过动态代理的方式实现
 */
public interface UserMapper {

    public List<User> queryUserList() throws Exception;

    //根据ID查
    //根据名称查
    //删除
    //修改
    //插入

}
