package com.example.customerapp.repository;

import com.example.customerapp.entity.FavouriteProduct;
import reactor.core.publisher.Mono;

public interface FavouriteProductRepository {

    Mono<FavouriteProduct> save(FavouriteProduct favouriteProduct);


    Mono<Void> deleteByProductId(int productId);

    Mono<FavouriteProduct> findByProductId(int productId);
}
