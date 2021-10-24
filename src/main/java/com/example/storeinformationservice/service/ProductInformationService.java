package com.example.storeinformationservice.service;

import com.example.storeinformationservice.model.Product;
import com.example.storeinformationservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductInformationService {

    @Autowired
    private ProductRepository productRepository;

    public Optional<Product> getProduct(Long id) {
        return productRepository.findById(id);
    }

    public List<Product> getProducts() {
        return productRepository.findAll();
    }

}
