package com.billund.demo.ShoppingCart.repository;


import com.billund.demo.ShoppingCart.models.Product;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    private static final List<Product> PRODUCTS = new ArrayList<>();

    static {
        PRODUCTS.add(new Product(101,"Lego Piece 1", new BigDecimal(20)));
        PRODUCTS.add(new Product(102,"Lego Piece 2", new BigDecimal(2)));
        PRODUCTS.add(new Product(103,"Lego Piece 3", new BigDecimal(10)));
        PRODUCTS.add(new Product(104,"Lego Piece 4", new BigDecimal(16)));
    }

    public List<Product> getProducts(){
        return PRODUCTS;
    }
}