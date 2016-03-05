package com.shop.service;
import com.shop.entity.User;
import org.springframework.beans.factory.annotation.Autowired;




/**
 * Created by lyc on 16-3-3.
 */

public interface UserService {

    public User findByUsername(String username);

}
