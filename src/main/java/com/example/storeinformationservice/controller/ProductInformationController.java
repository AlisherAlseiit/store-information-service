package com.example.storeinformationservice.controller;

import com.example.storeinformationservice.model.Product;
import com.example.storeinformationservice.service.ProductInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductInformationController {

    @Autowired
    private ProductInformationService service;


    @GetMapping("/{productId}")
    public Optional<Product> getAllProducts(@PathVariable("productId") Long id) {
        return service.getProduct(id);
    }



}
