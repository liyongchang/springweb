package com.shop.controler;
import com.shop.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.shop.service.UserService;
import java.io.IOException;

/**
 * Created by lyc on 16-3-3.
 */
@Component("userControler")
@RequestMapping(value="/User")
public class UserControler {
    @Autowired
     UserService userService;
    @RequestMapping(value="/find")
    public String findByName(Model model) throws IOException {
        User existUser= userService.findByUsername("aaa");
        model.addAttribute("existUser",existUser);
        return "success";
    }

}

