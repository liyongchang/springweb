package com.shop.Test;

import com.shop.dao.impl.ProductDao;
import com.shop.dao.impl.UserDao;
import com.shop.entity.Product;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by lyc on 16-3-8.
 */
public class productTest {
    private ApplicationContext context = new FileSystemXmlApplicationContext("web/WEB-INF/applicationContext.xml");
    //private UserDao userDao = (UserDao) context.getBean("userDao");
    ProductDao productDao = (ProductDao) context.getBean("productDao");

    @Test
    public void findProduByidTest() {
        Product product = productDao.findByPid(1);
        System.out.print(product.getPname());

    }

}
