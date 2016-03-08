package com.shop.dao;

import com.shop.entity.Categorysecond;

import java.util.List;

/**
 * Created by lyc on 16-3-8.
 */
public interface ICategorySecondDao {
    public int findCount();

    // DAO中分页查询的方法
    public List<Categorysecond> findByPage(int begin, int limit);

    // DAO中的保存二级分类的方法
    public void save(Categorysecond categorysecond);

    // DAO中的删除二级分类的方法
    public void delete(Categorysecond categorySecond);

    // DAO中根据id查询二级分类的方法
    public Categorysecond findByCsid(Integer csid);

    // DAO中的修改二级分类的方法
    public void update(Categorysecond categorysecond);

    // DAO中的查询所有二级分类的方法
    public List<Categorysecond> findAll();
}
