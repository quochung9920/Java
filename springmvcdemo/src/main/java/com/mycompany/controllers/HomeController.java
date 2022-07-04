package com.mycompany.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(Model model, 
        @RequestParam Map<String, String> params) {
        String firstName = params.get("first_name");
        String lastName = params.get("last_name");
        if(firstName != null && lastName != null) {
            model.addAttribute("name", String.format("%s %s", firstName, lastName));
        }
        else{
            model.addAttribute("name", "Hưng"); 
        }
        return "index";
    }

    @RequestMapping("/hello/{name}")
    public String hello(Model model, 
        @PathVariable(value = "name") String name) {
        model.addAttribute("message", "Welcome " + name);
        return "hello";
    }
}
