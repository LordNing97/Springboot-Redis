package com.cx.redis_demo.service.impl;

import com.cx.redis_demo.mapper.UserMapper;
import com.cx.redis_demo.model.User;
import com.cx.redis_demo.redis.RedisUtil;
import com.cx.redis_demo.service.UserService;
import com.cx.redis_demo.util.ResultMap;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author 陈璇
 * @Description UserServiceImpl
 * @date 2019/8/5 14:55
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private RedisUtil redisUtil;

    @Override
    public ResultMap getAllUser() {
        try{
            List<User> userList = userMapper.getAllUser();
            //写入缓存
            for(User user:userList){
                redisUtil.set("user_" + user.getName(),user);
            }
            return ResultMap.ok().put("200",userList);
        }catch (Exception e){
            e.printStackTrace();
            return ResultMap.error();
        }
    }

}
