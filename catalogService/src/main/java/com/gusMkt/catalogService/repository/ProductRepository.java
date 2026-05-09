package com.gusMkt.catalogService.repository;

import com.gusMkt.catalogService.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, String> {
    Product findByEan(String ean);
}

