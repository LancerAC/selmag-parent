package com.example.feedbackservice.service.impl;

import com.example.feedbackservice.entity.ProductReview;
import com.example.feedbackservice.repository.ProductReviewRepository;
import com.example.feedbackservice.service.ProductReviewsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ProductReviewsServiceImpl implements ProductReviewsService {

    private final ProductReviewRepository productReviewRepository;

    @Override
    public Mono<ProductReview> createProductReview(int productId, int rating, String review, String userId) {
        return this.productReviewRepository.save(
                new ProductReview(UUID.randomUUID(), productId, rating, review, userId));
    }

    @Override
    public Flux<ProductReview> findProductReviewsByProduct(int productId) {
        return this.productReviewRepository.findAllByProductId(productId);
    }
}