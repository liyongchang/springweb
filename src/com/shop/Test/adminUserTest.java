package com.shop.Test;

import com.shop.entity.Adminuser;
import com.shop.service.AdminuserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by lyc on 16-3-8.
 */
public class adminUserTest {
    private ApplicationContext context = new FileSystemXmlApplicationContext("web/WEB-INF/applicationContext.xml");
    private AdminuserService adminuserService = (AdminuserService) context.getBean("adminuserService");

    @Test
    public void TestAdminlogin() {
        Adminuser adminuser = new Adminuser();
        adminuser.setUsername("admin");
        adminuser.setPassword("admin");
        adminuserService.login(adminuser);
    }
}
