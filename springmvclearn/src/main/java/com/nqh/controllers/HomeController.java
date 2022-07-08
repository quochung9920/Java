package com.nqh.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nqh.pojos.User;
import com.nqh.service.CategoryService;
import com.nqh.service.ProductService;

@Controller
@ControllerAdvice
public class HomeController {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ProductService productService;

    @ModelAttribute
    public void commonAttr(Model model){
        model.addAttribute("categories", this.categoryService.getCategories());
    }

    @RequestMapping("/")
    public String index(Model model,
            @RequestParam(value = "kw", required = false, defaultValue = "") String kw) {
        model.addAttribute("products", this.productService.getProducts(kw));
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

    @RequestMapping(path = "/cart")
    public String cart(Model model){
        return "cart";
    }
}
