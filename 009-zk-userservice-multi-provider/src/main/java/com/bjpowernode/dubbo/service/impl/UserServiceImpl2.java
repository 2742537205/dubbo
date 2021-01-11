package com.bjpowernode.dubbo.service.impl;

import com.bjpowernode.dubbo.model.User;
import com.bjpowernode.dubbo.service.UserService;

/**
 * ClassName:UserServiceImpl2
 * Package:com.bjpowernode.dubbo.service.impl
 * Description:
 *
 * @date:2020/3/3 10:54
 * @author:蛙课网
 */
public class UserServiceImpl2 implements UserService {

    public User queryUserById(Integer id, String username) {
        User user = new User();
        user.setId(id);
        user.setUsername(username+"-2");
        return user;
    }
}
