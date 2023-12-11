package com.example.postgresql.controller;

import com.example.postgresql.repository.ProductRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/getAllProducts")
public class GetAllProductsController {

    private final ProductRepository productRepository;

    public GetAllProductsController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    
    @GetMapping
    public ResponseEntity getAllProducts() {

        return ResponseEntity.ok(this.productRepository.findAll());
    }
}
