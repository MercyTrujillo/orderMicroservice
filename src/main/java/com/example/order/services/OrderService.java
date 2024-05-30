package com.example.order.services;

import com.example.order.entity.Order;
import com.example.order.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    public OrderRepository orderRepository;

    public void addOrder(Order order ) {
        LocalDate date = LocalDate.now();
        order.setCreationDate(date);
       orderRepository.save(order);
    }

    public Optional<Order> getOrder(Integer orderId) {
        Optional<Order> order = orderRepository.findById(orderId);
        return order;
    }
}
