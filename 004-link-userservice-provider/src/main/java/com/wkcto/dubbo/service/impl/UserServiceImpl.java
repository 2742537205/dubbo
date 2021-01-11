package com.wkcto.dubbo.service.impl;

import com.wkcto.dubbo.model.User;
import com.wkcto.dubbo.service.UserService;

/**
 * ClassName:UserServiceImpl
 * Package:com.wkcto.dubbo.service.impl
 * Description:
 *
 * @date:2020/3/2 14:13
 * @author:蛙课网
 */
public class UserServiceImpl implements UserService {

    @Override
    public User queryUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setUsername("zhangsan");
        return user;
    }

    @Override
    public Integer queryAllUserCount() {
        return 52;
    }
}
