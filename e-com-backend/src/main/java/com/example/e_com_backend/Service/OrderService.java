package com.example.e_com_backend.Service;

import com.example.e_com_backend.Entity.Order;
import com.example.e_com_backend.Repository.OrderRepository;

public class OrderService {
    private OrderRepository orderRepository;
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }
}
