package com.example.customerapp.client;

import com.example.customerapp.entity.FavouriteProduct;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface FavouriteProductsClient {

    Flux<FavouriteProduct> findFavouriteProducts();

    Mono<FavouriteProduct> findFavouriteProductByProductId(int productId);

    Mono<FavouriteProduct> addProductToFavourites(int productId);

    Mono<Void> removeProductFromFavourites(int productId);
}
