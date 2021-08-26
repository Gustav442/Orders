package com.example.orders.controllers;

import com.example.orders.entities.Order;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.orders.repositories.OrderRepository;

@RestController
public class OrderController {


    OrderRepository orderRepository;


    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }


    @PostMapping("/order")
    public Order add(@RequestBody Order order) {
        return orderRepository.save(order);
    }
}
