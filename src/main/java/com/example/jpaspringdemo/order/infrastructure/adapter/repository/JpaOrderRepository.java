package com.example.jpaspringdemo.order.infrastructure.adapter.repository;

import com.example.jpaspringdemo.order.application.port.out.OrderRepositoryPort;
import com.example.jpaspringdemo.order.domain.Order;
import org.aspectj.weaver.ast.Or;

public class JpaOrderRepository implements OrderRepositoryPort {

    @Override
    public Order save(Order order) {
        return order;
    }

    @Override
    public Order findById(Long id) {
        return new Order();
    }
}
