package com.cx.redis_demo.mapper;

import com.cx.redis_demo.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author 陈璇
 * @Description UserMapper
 * @date 2019/8/5 14:47
 */
@Mapper
public interface UserMapper {

    List<User> getAllUser();

}
