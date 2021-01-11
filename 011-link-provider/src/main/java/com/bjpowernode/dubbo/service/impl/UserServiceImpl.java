package com.bjpowernode.dubbo.service.impl;

import com.bjpowernode.dubbo.service.UserService;

/**
 * ClassName:UserServiceImpl
 * Package:com.bjpowernode.dubbo.service.impl
 * Description:
 *
 * @date:2020/3/9 11:57
 * @author:蛙课网
 */
public class UserServiceImpl implements UserService {
    public String sayHello() {
        return "Hello Link Dubbo";
    }
}
