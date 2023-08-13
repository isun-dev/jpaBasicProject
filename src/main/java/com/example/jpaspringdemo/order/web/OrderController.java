package com.example.jpaspringdemo.order.web;

import com.example.jpaspringdemo.order.application.port.in.OrderUseCase;
import com.example.jpaspringdemo.order.domain.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RequiredArgsConstructor
public class OrderController {
    private final OrderUseCase orderUseCase;

    @PostMapping("/orders")
    public Order createOrder(@RequestBody Order order) {
        return orderUseCase.createOrder(order);
    }

    @GetMapping("/orders")
    public Order getOrderById(@RequestParam Long id) {
        return orderUseCase.getOrderById(id);
    }
}
