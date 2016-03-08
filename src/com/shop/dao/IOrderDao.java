package com.shop.dao;

import com.shop.entity.Orderitem;
import com.shop.entity.Orders;

import java.util.List;

/**
 * Created by lyc on 16-3-8.
 */
public interface IOrderDao {
    public void save(Orders order);

    // Dao层查询我的订单分页查询:统计个数
    public int findCountByUid(Integer uid);

    // Dao层查询我的订单分页查询:查询数据
    public List<Orders> findPageByUid(Integer uid, int begin, int limit);


    // DAO层根据订单id查询订单
    public Orders findByOid(Integer oid);

    // DAO层修改订单的方法:
    public void update(Orders currOrder);

    // DAO中统计订单个数的方法
    public int findCount();

    // DAO中分页查询订单的方法
    public List<Orders> findByPage(int begin, int limit);

    // DAo中根据订单id查询订单项
    public List<Orderitem> findOrderItem(Integer oid);
}
