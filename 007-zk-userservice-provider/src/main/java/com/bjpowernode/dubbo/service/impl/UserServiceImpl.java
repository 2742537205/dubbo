package com.bjpowernode.dubbo.service.impl;

import com.bjpowernode.dubbo.model.User;
import com.bjpowernode.dubbo.service.UserService;

/**
 * ClassName:UserServiceImpl
 * Package:com.bjpowernode.dubbo.service.impl
 * Description:
 *
 * @date:2020/3/3 9:37
 * @author:蛙课网
 */
public class UserServiceImpl implements UserService {

//    ctrl+I


    @Override
    public User queryUserById(Integer id,String username) {
        User user = new User();
        user.setId(id);
        user.setUsername(username);
        return user;
    }
}
