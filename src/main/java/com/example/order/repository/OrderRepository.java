package com.example.order.repository;

import com.example.order.entity.Order;
import org.springframework.data.repository.CrudRepository;

public interface  OrderRepository  extends CrudRepository <Order,Integer> {
}
