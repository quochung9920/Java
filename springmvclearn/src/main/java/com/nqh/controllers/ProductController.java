package com.nqh.controllers;

import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.nqh.pojos.Product;

@Controller
public class ProductController {
    @Autowired
    private Cloudinary cloudinary;

    @GetMapping("/admin/products")
    public String listProducts(Model model) {
        model.addAttribute("product", new Product());
        return "product";
    }


    @PostMapping("/admin/products")
    public String add(Model model, @ModelAttribute(value = "product") Product product) {
        try {
            Map r = this.cloudinary.uploader().upload(product.getFile().getBytes(), ObjectUtils.asMap("resource_type", "auto"));

            String url = (String) r.get("secure_url");

            model.addAttribute("url", url);

            return "forward:/";
        } catch (IOException e) {
            System.err.println("Loi: " + e.getMessage());
        }
        return "product";
    }
}
