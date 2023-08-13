package com.example.jpaspringdemo.order.application.port;

import com.example.jpaspringdemo.order.application.port.in.OrderUseCase;
import com.example.jpaspringdemo.order.application.port.out.OrderRepositoryPort;
import com.example.jpaspringdemo.order.domain.Order;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrderService implements OrderUseCase {
    private final OrderRepositoryPort orderRepository;
    @Override
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order getOrderById(Long id) {
        return orderRepository.findById(id);
    }
}
