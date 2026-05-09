package com.gusMkt.catalogService.service;

import com.gusMkt.catalogService.model.Product;
import com.gusMkt.catalogService.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class ProductService {
    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public Product findByEan(String ean) {
        return repository.findByEan(ean);
    }

}