package com.example.e_com_backend.Entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import lombok.*;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Entity
@Table(name = "product")
@Builder
@Setter
@Getter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int productId;

    @Column(name = "product_name", nullable = false, length = 100)
    private String productName;

    @Column(name = "product_desc", columnDefinition = "TEXT")
    private String productDesc;

    @Column(name = "image1", length = 255)
    private String image1;

    @Column(name = "image2", length = 255)
    private String image2;

    @Column(name = "image3", length = 255)
    private String image3;

    @Column(name = "price", nullable = false, precision = 10, scale = 2)
    private BigDecimal price;

    @Column(name = "stock")
    private int stock = 0;

    @Column(name = "category_id")
    private Integer categoryId;

    public Product(String productName, String productDesc, BigDecimal price, int stock, Integer categoryId) {
        this.productName = productName;
        this.productDesc = productDesc;
        this.price = price;
        this.stock = stock;
        this.categoryId = categoryId;
    }
}
