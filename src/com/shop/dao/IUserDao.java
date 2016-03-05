package com.shop.dao;
import com.shop.entity.User;
/**
 * Created by lyc on 16-3-3.
 */

public interface IUserDao{
    public User findByUsername(String username);
}
