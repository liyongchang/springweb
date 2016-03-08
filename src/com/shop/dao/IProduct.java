package com.shop.dao;

import com.shop.entity.Product;
import com.shop.util.PageHibernateCallback;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import java.util.List;

/**
 * Created by lyc on 16-3-8.
 */
public interface IProduct {
    public List<Product> findHot();

    // 首页上最新商品的查询
    public List<Product> findNew();

    // 根据商品ID查询商品
    public Product findByPid(Integer pid);

    // 根据分类id查询商品的个数
    public int findCountCid(Integer cid);

    // 根据分类id查询商品的集合
    public List<Product> findByPageCid(Integer cid, int begin, int limit);

    // 根据二级分类查询商品个数
    public int findCountCsid(Integer csid);

    // 根据二级分类查询商品信息
    public List<Product> findByPageCsid(Integer csid, int begin, int limit);

    // 后台统计商品个数的方法
    public int findCount();

    // 后台查询所有商品的方法
    public List<Product> findByPage(int begin, int limit);

    // DAO中的保存商品的方法
    public void save(Product product);

    // DAO中的删除商品的方法
    public void delete(Product product);

    public void update(Product product);
}
