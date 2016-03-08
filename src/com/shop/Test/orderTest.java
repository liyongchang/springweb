package com.shop.Test;

import com.shop.dao.impl.OrderDao;
import com.shop.dao.impl.ProductDao;
import com.shop.entity.Orders;
import com.shop.entity.Product;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.List;

/**
 * Created by lyc on 16-3-8.
 */
public class orderTest {
    private ApplicationContext context = new FileSystemXmlApplicationContext("web/WEB-INF/applicationContext.xml");
    ProductDao productDao = (ProductDao) context.getBean("productDao");
    OrderDao orderDao = (OrderDao) context.getBean("orderDao");

    @Test
    public void findProduByidTest() {
        Orders list = orderDao.findByOid(2000);
        int num = orderDao.findCount();
        System.out.print(num);
        System.out.print(list.getOrdertime());
    }

}
