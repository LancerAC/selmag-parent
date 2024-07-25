package com.example.customerapp.client;

import com.example.customerapp.entity.Product;
import reactor.core.publisher.Flux;

public interface ProductsClient {

    Flux<Product> findAllProducts(String filter);
}
