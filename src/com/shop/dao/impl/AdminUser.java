package com.shop.dao.impl;

import com.shop.dao.IAdminUser;
import com.shop.entity.Adminuser;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by lyc on 16-3-8.
 */
public class AdminUser extends HibernateDaoSupport implements IAdminUser {
    @Override
    public Adminuser login(Adminuser adminuser) {
        String hql = "from adminuser where username = ? and password = ?";
        List<Adminuser> list = (List<Adminuser>) this.getHibernateTemplate().find(hql, adminuser.getUsername(), adminuser.getPassword());
        if (list != null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }
}
