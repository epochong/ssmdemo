package com.ming.controller;


import com.ming.po.User;
import com.ming.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 视图解析器
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/queryUser")
    public ModelAndView queryUserController() throws Exception{

        List<User> userList =  userService.queryUserService();

        ModelAndView modelAndView = new ModelAndView();
        //key,value值，在jsp中找到此处
        modelAndView.addObject("userListKey",userList);
        //视图解析器
        modelAndView.setViewName("userlist");

        return modelAndView;
    }
}
