package com.hnglng.giving.web.controller;

import com.hnglng.giving.domain.model.User;
import com.hnglng.giving.infrastructure.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by huang_liang on 2017/2/23.
 */
@Controller
public class HelloController {
    @Autowired
    UserService userService;

    @RequestMapping("/hello")
    public String index(ModelMap map) {
        User user = userService.findUserby("AA");

        String userName = "Not found";
        if (user != null){
            userName = user.getName();
        }

        map.addAttribute("user", userName);
        return "hello";
    }

    @RequestMapping("/helloall")
    public String searchAll(ModelMap map) {
        List<User> users = userService.findAllUsers();
        map.addAttribute("users", users);
        return "hello";
    }
}
