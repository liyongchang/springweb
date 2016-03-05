package com.shop.dao.impl;

import com.shop.dao.IUserDao;
import com.shop.entity.User;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;


import java.util.List;

/**
 * Created by lyc on 16-3-5.
 */
public class UserDao extends HibernateDaoSupport implements IUserDao {
    @Override
    public User findByUsername(String username) {
        String hql = "from User where username = ?";
        List<User> list = (List<User>) this.getHibernateTemplate().find(hql,username);
        if (list != null && list.size() > 0) {
            return list.get(0);
        }else {
            return null;
        }
    }
}
