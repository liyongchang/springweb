package com.shop.dao.impl;

import com.shop.dao.ICategorySecondDao;
import com.shop.entity.Categorysecond;
import com.shop.util.PageHibernateCallback;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by lyc on 16-3-8.
 */
public class CategorySecondDao extends HibernateDaoSupport implements ICategorySecondDao {

    // DAO中的统计二级分类个数的方法
    public int findCount() {
        String hql = "select count(*) from categorysecond";
        List<Long> list = (List<Long>) this.getHibernateTemplate().find(hql);
        if (list != null && list.size() > 0) {
            return list.get(0).intValue();
        }
        return 0;
    }

    // DAO中分页查询的方法
    public List<Categorysecond> findByPage(int begin, int limit) {
        String hql = "from categorysecond order by csid desc";
        List<Categorysecond> list = this.getHibernateTemplate().execute(
                new PageHibernateCallback<Categorysecond>(hql, null, begin,
                        limit));
        return list;
    }

    // DAO中的保存二级分类的方法
    public void save(Categorysecond categorysecond) {
        this.getHibernateTemplate().save(categorysecond);
    }

    // DAO中的删除二级分类的方法
    public void delete(Categorysecond categorySecond) {
        this.getHibernateTemplate().delete(categorySecond);
    }

    // DAO中根据id查询二级分类的方法
    public Categorysecond findByCsid(Integer csid) {
        return this.getHibernateTemplate().get(Categorysecond.class, csid);
    }

    // DAO中的修改二级分类的方法
    public void update(Categorysecond categorysecond) {
        this.getHibernateTemplate().update(categorysecond);
    }

    // DAO中的查询所有二级分类的方法
    public List<Categorysecond> findAll() {
        String hql = "from categorysecond";
        return (List<Categorysecond>) this.getHibernateTemplate().find(hql);
    }

}
