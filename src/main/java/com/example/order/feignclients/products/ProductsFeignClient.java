package com.example.order.feignclients.products;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@FeignClient(name = "products", url =  "http://localhost:8082/products")
@RequestMapping("/products")
public interface ProductsFeignClient {

    @GetMapping("/products")
    public List<ProductsResponse> productsList();

    @GetMapping ("/products/{productId}")
    public ProductsResponse productId(@PathVariable Integer id);



}
