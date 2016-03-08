package com.shop.service.impl;

import com.shop.dao.impl.AdminUser;
import com.shop.entity.Adminuser;
import com.shop.service.AdminuserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by lyc on 16-3-8.
 */
@Component("adminuserService")
@Service
public class AdminuserServiceImpl implements AdminuserService {
    @Resource(name = "adminUser")
    AdminUser adminUser;

    @Override
    public Adminuser login(Adminuser adminuser) {
        return adminUser.login(adminuser);
    }
}
