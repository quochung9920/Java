package com.mycompany.controllers;

import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller 
public class HomeController {
    @Autowired
    private LocalSessionFactoryBean sessionFactory;

    @RequestMapping("/")
    public String index(Model model) {
        Session session = sessionFactory.getObject().openSession();
        Query q = session.createQuery("FROM Category");

        model.addAttribute("categories", q.getResultList());

        session.close();




        return "index";
    }

    @RequestMapping("/hello/{name}")
    public String hello(Model model, 
        @PathVariable(value = "name") String name) {
        model.addAttribute("message", "Welcome " + name);
        return "hello";
    }

    // @RequestMapping(path = "/hello-post", method = RequestMethod.POST)
    // public String show(Model model, 
    //     @ModelAttribute(value = "user") User user) {
    //     model.addAttribute("fullName", user.getFirstName() + " " + user.getLastName());
            
    //     return "index";
    // }

    @RequestMapping(path = "/test")
    public String testRedirect(Model model){
        model.addAttribute("testMsg", "Welcome to test redirect");
        
        return "forward:/hello/Hung";
    }
}
