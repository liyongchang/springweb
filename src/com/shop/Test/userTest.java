package com.shop.Test;

import com.shop.dao.impl.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * junitTest
 * Created by lyc on 16-3-4.
 */
public class userTest {
    private ApplicationContext context=new FileSystemXmlApplicationContext("web/WEB-INF/applicationContext.xml");
    @Test
    public void  UserTest(){
        UserDao userDao=(UserDao) context.getBean("userDao");
        if(context.getBean("userControler").toString()==""){
            System.out.print("sss");
        }else {
            System.out.println(context.getBean("userControler").getClass());
        }
        userDao.findByUsername("aaa");
    }
}
