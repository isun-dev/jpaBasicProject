package com.example.jpaspringdemo.order.application.port.in;

import com.example.jpaspringdemo.order.domain.Order;

public interface OrderUseCase {
    Order createOrder(Order order);
    Order getOrderById(Long id);
}
