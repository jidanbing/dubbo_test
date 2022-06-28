package com.wkcto.dubbo.service.impl;

import com.wkcto.dubbo.model.User;
import com.wkcto.dubbo.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User queryUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setUsername("lihua");
        user.setAge(18);

        return user;
    }
}
