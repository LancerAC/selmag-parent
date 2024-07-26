package com.example.customerapp.repository;

import com.example.customerapp.entity.ProductReview;
import reactor.core.publisher.Flux;

public interface ProductReviewRepository {

    Flux<ProductReview> findAllByProductId(int productId);
}
