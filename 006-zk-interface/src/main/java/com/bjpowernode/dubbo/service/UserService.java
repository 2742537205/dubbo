package com.bjpowernode.dubbo.service;

import com.bjpowernode.dubbo.model.User;

/**
 * ClassName:UserService
 * Package:com.bjpowernode.dubbo.service
 * Description:
 *
 * @date:2020/3/3 9:33
 * @author:蛙课网
 */
public interface UserService {


    /**
     * 根据用户标识获取用户的信息
     * @param id
     * @param username
     * @return
     */
    User queryUserById(Integer id,String username);
}
