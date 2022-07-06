package com.nqh.repository;

import java.util.List;

import com.nqh.pojos.Product;

public interface ProductRepository {
    List<Product> getProducts(String kw);
}
