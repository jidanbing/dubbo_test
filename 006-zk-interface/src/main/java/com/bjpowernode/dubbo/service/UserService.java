package com.bjpowernode.dubbo.service;

import com.bjpowernode.dubbo.model.User;

public interface UserService {

    /**
     * 根据用户标识获取用户信息
     * @param id
     * @return
     */
    User queryUserById(Integer id);
}
