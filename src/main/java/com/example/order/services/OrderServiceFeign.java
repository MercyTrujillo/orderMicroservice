//package com.example.order.services;
//
//import com.example.order.OrderApplication;
//import com.example.order.feignclients.customer.CustomerClient;
//import com.example.order.feignclients.products.ProductsFeignClient;
//import com.example.order.services.OrderService;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import jakarta.persistence.criteria.Order;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Primary;
//import org.springframework.data.domain.jaxb.SpringDataJaxb;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class OrderServiceFeign extends OrderService {
//    private static final Logger log = LoggerFactory.getLogger(OrderApplication.class);
//    @Autowired
//    private ProductsFeignClient productsFeignClient;
//
//
//    @Autowired
//    private CustomerClient customerClient;
//
//
//    public List<Order> orderList(){
//        return null;
//    }
//
//
//
//}
