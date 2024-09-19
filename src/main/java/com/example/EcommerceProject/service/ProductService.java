package com.example.EcommerceProject.service;

import com.example.EcommerceProject.model.Product;
import com.example.EcommerceProject.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;

    public List<Product> getAllProducts() {

        return repo.findAll();

    }

    public Product getProductById(int id) {
        return repo.findById(id).orElse(null);
    }

//    public Product addProduct(Product product, MultipartFile imageFile) throws IOException {
//        repo.save(product);
//    }
}
