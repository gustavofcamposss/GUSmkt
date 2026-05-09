package com.gusMkt.catalogService.controller;

import com.gusMkt.catalogService.model.Product;
import com.gusMkt.catalogService.service.ProductService;
import com.gusMkt.catalogService.util.EanValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;


@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService service;
    private final Logger logger = LoggerFactory.getLogger(ProductController.class);

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping("/{ean}")
    public ResponseEntity<?> getByEan(@PathVariable String ean) {
        if (ean == null || !EanValidator.isValidEan(ean)) {
            return ResponseEntity.badRequest()
                    .body(Collections.singletonMap("error", "EAN inválido"));
        }

        Product product = service.findByEan(ean);
        if (product != null) {
            logger.info("Product found for EAN={}", ean);
            return ResponseEntity.ok(product);
        } else {
            logger.info("Product not found for EAN={}", ean);
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(Collections.singletonMap("error", "Produto não encontrado"));
        }
    }

}
