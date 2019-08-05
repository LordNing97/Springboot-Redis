package com.cx.redis_demo.controller;

import com.cx.redis_demo.service.UserService;
import com.cx.redis_demo.util.ResultMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author 陈璇
 * @Description UserController
 * @date 2019/8/5 14:58
 */
@RestController
@RequestMapping("/redis")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/getAllUser")
    public ResultMap getAllUser(){
        return userService.getAllUser();
    }

}
