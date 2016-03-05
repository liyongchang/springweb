package com.shop.service.impl;


import com.shop.dao.impl.UserDao;
import com.shop.entity.User;
import com.shop.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by lyc on 16-3-5.
 */
@Component("userService")
@Service
public class UserServiceImpl implements UserService{
    @Resource(name = "userDao")
    UserDao userDao;
    @Override
    public User findByUsername(String username) {
       return userDao.findByUsername(username);
    }
}
