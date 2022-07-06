package com.nqh.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nqh.pojos.User;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(Model model, 
            @RequestParam(required = false) Map<String, String> params) {
        
        String firstName = params.get("first_name");
        String lastName = params.get("last_name");
        
        if(firstName != null && lastName != null) {
            model.addAttribute("name", String.format("%s %s", firstName, lastName));
        }
        else{
            model.addAttribute("name", lastName);
        }

        model.addAttribute("user", new User());

        
        List<User> users = new ArrayList<>();
        users.add(new User("John", "Doe"));
        users.add(new User("Jane", "Doe"));

        model.addAttribute("users", users);
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
}
