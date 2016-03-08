package com.shop.service;


import com.shop.entity.User;
import com.shop.util.PageBean;

/**
 * Created by lyc on 16-3-3.
 */

public interface UserService {

    public User findByUsername(String username);

    public void save(User user);

    public User findByCode(String code);

    public void update(User existUser);

    public User login(User user);

    public int findCount();

    public User findByUid(Integer uid);

    public void delete(User existUser);

    public PageBean<User> findByPage(Integer page);

}
