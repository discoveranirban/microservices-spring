package com.discoveranirban.orderservice.repository;

import com.discoveranirban.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
