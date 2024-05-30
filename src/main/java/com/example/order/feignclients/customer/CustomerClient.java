package com.example.order.feignclients.customer;
import com.example.order.feignclients.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "customer", url = "http://localhost:8083", configuration = FeignConfig.class)
public interface CustomerClient {

    @GetMapping("/customer/{customerID}")
    CustomerResponse getCustomerById(@PathVariable("customerID") Integer customerID);
}
