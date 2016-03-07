package com.shop.dao;

import com.shop.entity.User;

import java.util.List;

/**
 * Created by lyc on 16-3-3.
 */

public interface IUserDao {
    public User findByUsername(String username);

    public void save(User user);

    public User findByCode(String code);

    public void update(User existUser);

    public User login(User user);

    public int findCount();

    public List<User> findByPage(int begin, int limit);

    public User findByUid(Integer uid);

    public void delete(User existUser);

}
