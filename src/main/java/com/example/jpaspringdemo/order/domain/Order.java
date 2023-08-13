package com.example.jpaspringdemo.order.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String product;
    private double price;

    // Getters, setters, constructors and other methods...
}
