package com.victor.cartapp.backendcartapp.services;

import java.util.List;

import com.victor.cartapp.backendcartapp.models.entities.Product;

public interface ProductService {
    List<Product> findAll();
    
}
