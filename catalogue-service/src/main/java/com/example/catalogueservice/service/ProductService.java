package com.example.catalogueservice.service;

import com.example.catalogueservice.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    Iterable<Product> findAllProducts(String filter);

    Product createProduct(String title, String details);

    Optional<Product> findProduct(int productId);

    void updateProduct(Integer id, String title, String details);

    void deleteProduct(Integer id);

}
