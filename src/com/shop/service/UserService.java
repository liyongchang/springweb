package com.shop.service;


import com.shop.entity.User;

/**
 * Created by lyc on 16-3-3.
 */

public interface UserService {

    public User findByUsername(String username);

}
