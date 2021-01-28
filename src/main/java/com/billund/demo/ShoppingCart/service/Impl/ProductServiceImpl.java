package com.billund.demo.ShoppingCart.service.Impl;


import com.billund.demo.ShoppingCart.models.Product;
import com.billund.demo.ShoppingCart.repository.ProductRepository;
import com.billund.demo.ShoppingCart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public Optional<Product> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Product> findById(Integer id) {
        return Optional.empty();
    }

    public List<Product> getAllProducts(){
        return productRepository.getProducts();
    }
}
