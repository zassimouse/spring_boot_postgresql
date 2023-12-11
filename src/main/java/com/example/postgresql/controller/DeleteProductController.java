package com.example.postgresql.controller;

import com.example.postgresql.model.Product;
import com.example.postgresql.model.Request;
import com.example.postgresql.repository.ProductRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deleteProduct")
public class DeleteProductController {

    private final ProductRepository productRepository;

    public DeleteProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostMapping
    public ResponseEntity deleteProduct(@RequestBody Request r) {

        productRepository.deleteById(r.productId);
        return ResponseEntity.ok("Product deleted!");
    }
}
