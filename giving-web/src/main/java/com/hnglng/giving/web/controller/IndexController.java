package com.hnglng.giving.web.controller;

import com.hnglng.giving.domain.model.User;
import com.hnglng.giving.infrastructure.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Bright Huang on 3/18/17.
 */
@Controller
public class IndexController {
    @Autowired
    UserService userService;

    @RequestMapping("/hello")
    public ModelAndView hello(ModelMap map) {
        User user = userService.findUserby("AA");
        String userName = "Not found";
        if (user != null) {
            userName = user.getName();
        }
        map.addAttribute("user", userName);
        return new ModelAndView("hello", map);
    }


    /*
    @RequestMapping(value = {"/", "/index"})
    public ModelAndView index(ModelMap map) {
        String userName = "Freemarker";
        map.addAttribute("user", userName);
        return new ModelAndView("index", map);
    }
    */

    /**
     * Go Index
     * @return
     */
    @RequestMapping(value={"", "/", "index"})
    public String index() {
        return "index";
    }

    /**
     * unauthor
     * @return
     */
    @RequestMapping("unauthor")
    public String unauthor() {
        return "unauthor.jsp";
    }

    /**
     * reports
     * @return
     */
    @RequestMapping("reports")
    public String reports() {
        return "reports.jsp";
    }
}
