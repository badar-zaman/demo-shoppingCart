package com.billund.demo.ShoppingCart.service;

import com.billund.demo.ShoppingCart.models.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    Optional<Product> findById(Integer id);

    List<Product> getAllProducts();

}