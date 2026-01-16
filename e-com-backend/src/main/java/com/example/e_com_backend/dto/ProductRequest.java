package com.example.e_com_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequest {
    private String productName;
    private String productDesc;
    private String image1;
    private String image2;
    private String image3;
    private BigDecimal price;
    private int stock;
    private Integer categoryId;
}
