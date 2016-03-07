package com.shop.Test;

import com.shop.dao.impl.UserDao;
import com.shop.entity.User;
import com.shop.service.UserService;
import com.shop.service.impl.UserServiceImpl;
import com.shop.util.UUIDUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import javax.annotation.Resource;

/**
 * junitTest
 * Created by lyc on 16-3-4.
 */
public class userTest {
    private ApplicationContext context = new FileSystemXmlApplicationContext("web/WEB-INF/applicationContext.xml");
    private UserDao userDao = (UserDao) context.getBean("userDao");
    private UserService userService = (UserService) context.getBean("userService");

    @Test
    public void UserTestfindByUsername() {

        if (context.getBean("userControler").toString() == "") {
            System.out.print("sss");
        } else {
            System.out.println(context.getBean("userControler").getClass());
        }
        //用户名查找
        userDao.findByUsername("aaa");
    }

    @Test
    public void Testuuid() {
        String uuid = UUIDUtils.getUUID();
        System.out.println(uuid);

    }

    @Test
    public void TestfindCount() {
        //返回数量
        int count = userDao.findCount();
        System.out.println(count);

    }

    @Test
    public void Testsave() {
        //返回数量
        User user = new User();
        user.setUsername("abc");
        user.setUid(9);
        userService.save(user);

    }

    @Test
    public void Testdelete() {
        User user = userService.findByUid(9);
        userService.delete(user);

    }


}
