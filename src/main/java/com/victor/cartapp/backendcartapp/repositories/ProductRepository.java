package com.victor.cartapp.backendcartapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.victor.cartapp.backendcartapp.models.entities.Product;

public interface ProductRepository extends CrudRepository<Product,Long> {
    
}
