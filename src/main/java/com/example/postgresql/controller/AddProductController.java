package com.example.postgresql.controller;

import com.example.postgresql.model.Product;
import com.example.postgresql.repository.ProductRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addProduct")
public class AddProductController {

    private final ProductRepository productRepository;

    public AddProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostMapping
    public ResponseEntity addProduct(@RequestBody Product p) {
        productRepository.save(p);
        return ResponseEntity.ok("Product added!");
    }
}
