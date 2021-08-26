package com.example.orders.repositories;

import com.example.orders.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;


    public interface OrderRepository extends JpaRepository<Order, Long> {

    }

