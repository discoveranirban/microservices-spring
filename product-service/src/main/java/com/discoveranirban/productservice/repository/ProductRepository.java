package com.discoveranirban.productservice.repository;

import com.discoveranirban.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
