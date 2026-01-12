package com.example.e_com_backend.Controller;

import com.example.e_com_backend.Entity.Product;
import com.example.e_com_backend.Service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@AllArgsConstructor
public class ProductController {
    private ProductService productService;
    @GetMapping
    public List<Product> getAllProduct() {
        return productService.getAllProduct();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById (@PathVariable int id, int productId) {
        Product product = productService.getProductById(productId);
        return ResponseEntity.ok(product);
    }
    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        Product savedProduct = productService.createProduct(product);
        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
    }


}
