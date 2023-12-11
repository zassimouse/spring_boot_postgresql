package com.example.postgresql.controller;

import com.example.postgresql.model.Product;
import com.example.postgresql.model.Request;
import com.example.postgresql.repository.ProductRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/getProduct")
public class GetProductController {

    private final ProductRepository productRepository;

    public GetProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public ResponseEntity getProduct(@RequestBody Request r) {

        return ResponseEntity.ok(this.productRepository.findById(r.productId));
    }

}
