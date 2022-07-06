package com.nqh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nqh.pojos.Product;
import com.nqh.repository.ProductRepository;
import com.nqh.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getProducts(String kw) {
        return this.productRepository.getProducts(kw);
    }

}
