package com.bjpowernode.dubbo.service.impl;

import com.bjpowernode.dubbo.service.ShopService;
import com.bjpowernode.dubbo.service.UserService;

/**
 * ClassName:ShopServiceImpl
 * Package:com.bjpowernode.dubbo.service.impl
 * Description:
 *
 * @date:2020/3/9 12:08
 * @author:蛙课网
 */
public class ShopServiceImpl implements ShopService {

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String hello() {
        String sayHello = userService.sayHello();
        return sayHello;
    }
}
