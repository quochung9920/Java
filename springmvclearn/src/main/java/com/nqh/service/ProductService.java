package com.nqh.service;

import java.util.List;

import com.nqh.pojos.Product;

public interface ProductService {
    List<Product> getProducts(String kw);
}
