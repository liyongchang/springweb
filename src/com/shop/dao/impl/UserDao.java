package com.shop.dao.impl;

import com.shop.dao.IUserDao;
import com.shop.entity.User;
import com.shop.util.PageHibernateCallback;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by lyc on 16-3-5.
 */
public class UserDao extends HibernateDaoSupport implements IUserDao {
    @Override
    public User findByUsername(String username) {
        String hql = "from user where username = ?";
        List<User> list = (List<User>) this.getHibernateTemplate().find(hql, username);
        if (list != null && list.size() > 0) {
            return list.get(0);
        } else {
            return null;
        }
    }

    // 注册用户存入数据库代码实现
    public void save(User user) {
        this.getHibernateTemplate().save(user);
    }

    // 根据激活码查询用户
    public User findByCode(String code) {
        String hql = "from user  where code = ?";
        List<User> list = (List<User>) this.getHibernateTemplate().find(hql, code);
        if (list != null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

    // 修改用户状态的方法
    public void update(User existUser) {
        this.getHibernateTemplate().update(existUser);
    }


    public User login(User user) {
        String hql = "from user  where username = ? and password = ? and state = ?";
        List<User> list = (List<User>) this.getHibernateTemplate().find(hql,
                user.getUsername(), user.getPassword(), 1);
        if (list != null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

    public int findCount() {
        String hql = "select count(*) from user";
        List<Long> list = (List<Long>) this.getHibernateTemplate().find(hql);
        if (list != null && list.size() > 0) {
            return list.get(0).intValue();
        }
        return 0;
    }

    public List<User> findByPage(int begin, int limit) {
        String hql = "from user";
        List<User> list = this.getHibernateTemplate().execute(
                new PageHibernateCallback<User>(hql, null, begin, limit));
        return list;
    }

    public User findByUid(Integer uid) {
        return this.getHibernateTemplate().get(User.class, uid);
    }

    public void delete(User existUser) {
        this.getHibernateTemplate().delete(existUser);
    }

}
