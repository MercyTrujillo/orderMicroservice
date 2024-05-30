package com.example.order.controller;

import com.example.order.entity.Order;
import com.example.order.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class OrderController {


    @Autowired
    private OrderService orderService;
    @RequestMapping(method = RequestMethod.POST, value = "/order")
    public void addOrder(@RequestBody Order order){
        orderService.addOrder(order);

    }


    @RequestMapping(method = RequestMethod.GET,value = "/order/{orderId}")
    public Optional<Order> getOrder(@PathVariable Integer orderId){
        return orderService.getOrder(orderId);

    }





}
