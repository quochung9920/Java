package com.nqh.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nqh.pojos.User;
import com.nqh.service.CategoryService;

@Controller
public class HomeController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/")
    public String index(Model model) {

        model.addAttribute("categories", this.categoryService.getCategories());
        return "index";
    }

    @RequestMapping("/hello/{name}")
    public String hello(Model model, 
            @PathVariable String name) {
        model.addAttribute("message", "Hello " + name);
        return "hello";
    }

    @RequestMapping(path = "/hello-post", method = RequestMethod.POST)
    public String show(Model model, @ModelAttribute(value="user") User user) {
        model.addAttribute("fullName", user.getFirstName() + " " + user.getLastName());

        return "index";
    }

    @RequestMapping(path = "/test")
    public String testRedirect(Model model){
        model.addAttribute("testMsg", "Welcome to test page");
        
        return "redirect:/hello/Hung";
    }
}
