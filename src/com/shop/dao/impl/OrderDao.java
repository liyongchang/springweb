package com.shop.dao.impl;

import com.shop.entity.Orderitem;
import com.shop.entity.Orders;
import com.shop.util.PageHibernateCallback;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by lyc on 16-3-8.
 */
public class OrderDao extends HibernateDaoSupport {

    // Dao层的保存订单额操作
    public void save(Orders order) {
        this.getHibernateTemplate().save(order);
    }

    // Dao层查询我的订单分页查询:统计个数
    public int findCountByUid(Integer uid) {
        String hql = "select count(*) from orders o where o.user.uid = ?";
        List<Long> list = (List<Long>) this.getHibernateTemplate().find(hql, uid);
        if (list != null && list.size() > 0) {
            return list.get(0).intValue();
        }
        return 0;
    }

    // Dao层查询我的订单分页查询:查询数据
    public List<Orders> findPageByUid(Integer uid, int begin, int limit) {
        String hql = "from orders o where o.user.uid = ? order by o.ordertime desc";
        List<Orders> list = this.getHibernateTemplate().execute(
                new PageHibernateCallback<Orders>(hql, new Object[]{uid},
                        begin, limit));
        if (list != null && list.size() > 0) {
            return list;
        }
        return null;
    }

    // DAO层根据订单id查询订单
    public Orders findByOid(Integer oid) {
        return this.getHibernateTemplate().get(Orders.class, oid);
    }

    // DAO层修改订单的方法:
    public void update(Orders currOrder) {
        this.getHibernateTemplate().update(currOrder);
    }

    // DAO中统计订单个数的方法
    public int findCount() {
        String hql = "select count(*) from orders";
        List<Long> list = (List<Long>) this.getHibernateTemplate().find(hql);
        if (list != null && list.size() > 0) {
            return list.get(0).intValue();
        }
        return 0;
    }

    // DAO中分页查询订单的方法
    public List<Orders> findByPage(int begin, int limit) {
        String hql = "from orders order by ordertime desc";
        List<Orders> list = this.getHibernateTemplate().execute(
                new PageHibernateCallback<Orders>(hql, null, begin, limit));
        return list;
    }

    // DAo中根据订单id查询订单项
    public List<Orderitem> findOrderItem(Integer oid) {
        String hql = "from orderItem oi where oi.orders.oid = ?";
        List<Orderitem> list = (List<Orderitem>) this.getHibernateTemplate().find(hql, oid);
        if (list != null && list.size() > 0) {
            return list;
        }
        return null;
    }
}
