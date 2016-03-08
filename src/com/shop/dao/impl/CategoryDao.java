package com.shop.dao.impl;

import com.shop.dao.ICategoryDao;
import com.shop.entity.Category;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by lyc on 16-3-8.
 */
public class CategoryDao extends HibernateDaoSupport implements ICategoryDao {

    //DAO层的查询所有一级分类的方法
    public List<Category> findAll() {
        String hql = "from category";
        List<Category> list = (List<Category>) this.getHibernateTemplate().find(hql);
        return list;
    }

    // Dao中的保存一级分类的方法
    public void save(Category category) {
        this.getHibernateTemplate().save(category);
    }

    // Dao中根据一级分类id查询一级分类
    public Category findByCid(Integer cid) {
        return this.getHibernateTemplate().get(Category.class, cid);
    }

    // DAO中删除一级分类
    public void delete(Category category) {
        this.getHibernateTemplate().delete(category);
    }

    // Dao中修改一级分类
    public void update(Category category) {
        this.getHibernateTemplate().update(category);
    }

}

