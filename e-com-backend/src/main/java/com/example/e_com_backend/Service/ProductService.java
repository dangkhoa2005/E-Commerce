package com.example.e_com_backend.Service;

import com.example.e_com_backend.Entity.Product;
import com.example.e_com_backend.Repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductService {
    private ProductRepository productRepository;
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }
    public Product getProductById(int id) {
        Optional<Product> product = productRepository.findById(id);
        return product.orElseThrow(() -> new IllegalArgumentException("Product not found"));
    }

}
