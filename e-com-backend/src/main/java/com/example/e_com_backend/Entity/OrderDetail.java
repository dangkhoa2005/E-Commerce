package com.example.e_com_backend.Entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import lombok.*;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Entity
@Table(name = "order_details")
@Builder
@Setter
@Getter
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_details_id")
    private int orderDetailsId;

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "product_qty", nullable = false)
    private int productQty;

    @Column(name = "product_price", nullable = false, precision = 10, scale = 2)
    private BigDecimal productPrice;

    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "subtotal", precision = 10, scale = 2)
    private BigDecimal subtotal;


    public OrderDetail(Integer productId, int productQty, BigDecimal productPrice, Integer orderId, BigDecimal subtotal) {
        this.productId = productId;
        this.productQty = productQty;
        this.productPrice = productPrice;
        this.orderId = orderId;
        this.subtotal = subtotal;
    }
}
