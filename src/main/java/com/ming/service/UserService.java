package com.ming.service;

import com.ming.po.User;

import java.util.List;

/**
 * 有自己的实现类
 * 所以要使用配置文件扫描或通过applicationContext文件配置扫描包的形式导入
 */
public interface UserService {
     List<User> queryUserService() throws Exception;
}
