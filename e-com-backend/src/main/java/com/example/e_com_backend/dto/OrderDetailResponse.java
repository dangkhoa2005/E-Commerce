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
public class OrderDetailResponse {
    private int orderDetailsId;
    private int productId;
    private String productName;
    private int productQty;
    private BigDecimal productPrice;
    private BigDecimal subtotal;
}
