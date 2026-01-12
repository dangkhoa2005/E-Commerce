package com.example.e_com_backend.Entity;

import jakarta.persistence.*;
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
    private Long product_Id;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "product_detail")
    private String productDetail;
    private float price;
    private int stock;

}
