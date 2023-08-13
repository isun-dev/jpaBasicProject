package com.example.jpaspringdemo.order.application.port.out;

import com.example.jpaspringdemo.order.domain.Order;

public interface OrderRepositoryPort {
    Order save(Order order);
    Order findById(Long id);
}
