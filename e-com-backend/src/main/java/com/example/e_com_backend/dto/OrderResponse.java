package com.example.e_com_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderResponse {
    private int orderId;
    private String orderNo;
    private LocalDateTime orderDate;
    private BigDecimal orderTotal;
    private int customerId;
    private String customerName;
    private String customerEmail;
    private LocalDateTime shippingDate;
    private boolean isDelivered;
    private List<OrderDetailResponse> orderDetails;
}
