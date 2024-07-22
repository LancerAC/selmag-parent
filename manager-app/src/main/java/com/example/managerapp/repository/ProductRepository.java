package com.example.managerapp.repository;

import com.example.managerapp.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository /*extends JpaRepository<Product, Integer>*/ {
    Optional<Product> findById(Integer id);

    Product save(Product product);

    void deleteById(Integer id);

    List<Product> findAll();
}
