package com.wkcto.dubbo.service;

import com.wkcto.dubbo.model.User;

/**
 * ClassName:UserService
 * Package:com.wkcto.dubbo.service
 * Description:
 *
 * @date:2020/3/2 10:37
 * @author:蛙课网
 */
public interface UserService {

    /**
     * 根据用户标识获取用户信息
     * @param id
     * @return
     */
    User queryUserById(Integer id);
}
