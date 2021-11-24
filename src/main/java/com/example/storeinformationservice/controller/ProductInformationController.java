package com.example.storeinformationservice.controller;

import com.example.storeinformationservice.model.Product;
import com.example.storeinformationservice.service.ProductInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductInformationController {

    private static final String TOPIC = "store_test";

    @Autowired
    private ProductInformationService service;

    @Autowired
    private KafkaTemplate<String, Optional<Product>> kafkaTemplate;

    @GetMapping
    public List<Product> getProducts() {
        return  service.getProducts();
    }

    @GetMapping("/{productId}")
    public Optional<Product> getAllProducts(@PathVariable("productId") Long id) {

        kafkaTemplate.send(TOPIC, service.getProduct(id));
        return service.getProduct(id);
    }



}
