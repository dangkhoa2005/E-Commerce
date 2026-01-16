package com.example.e_com_backend.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Entity
@Table(name = "orders")
@Builder
@Setter
@Getter
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private int orderId;

    @Column(name = "order_no", nullable = false, length = 50)
    private String orderNo;

    @Column(name = "order_date")
    private LocalDateTime orderDate;

    @Column(name = "order_total", precision = 10, scale = 2)
    private BigDecimal orderTotal;

    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name = "shipping_date")
    private LocalDateTime shippingDate;

    @Column(name = "is_delivered")
    private boolean isDelivered = false;

    public Order(String orderNo, BigDecimal orderTotal, Integer customerId) {
        this.orderNo = orderNo;
        this.orderTotal = orderTotal;
        this.customerId = customerId;
        this.orderDate = LocalDateTime.now();
    }
}
