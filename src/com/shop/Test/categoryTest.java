package com.shop.Test;

import com.shop.dao.impl.CategoryDao;
import com.shop.dao.impl.CategorySecondDao;
import com.shop.dao.impl.OrderDao;
import com.shop.dao.impl.ProductDao;
import com.shop.entity.Category;
import com.shop.entity.Categorysecond;
import com.shop.entity.Orders;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.List;

/**
 * Created by lyc on 16-3-8.
 */
public class categoryTest {
    private ApplicationContext context = new FileSystemXmlApplicationContext("web/WEB-INF/applicationContext.xml");
    CategoryDao categoryDao = (CategoryDao) context.getBean("categoryDao");
    CategorySecondDao categorySecondDao = (CategorySecondDao) context.getBean("categorySecondDao");

    @Test
    public void findProduByidTest() {
        Category category = categoryDao.findByCid(1);
        System.out.println(category.getCname());
        List<Categorysecond> categorysecondList = categorySecondDao.findAll();
        System.out.println(categorysecondList.size());
        for (Categorysecond list : categorysecondList) {
            System.out.println(list.getCsname());
        }

    }

}
