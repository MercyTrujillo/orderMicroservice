package com.example.order.services;

import com.example.order.entity.Order;
import com.example.order.feignclients.customer.CustomerClient;
import com.example.order.feignclients.customer.CustomerResponse;
import com.example.order.feignclients.products.ProductsFeignClient;
import com.example.order.feignclients.products.ProductsResponse;
import com.example.order.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private CustomerClient customerClient;

   private ProductsFeignClient productsFeignClient;

    @Autowired
    public OrderRepository orderRepository;

//    public Order createOrder(){
//        List<ProductsResponse> productsResponses =
//                productsFeignClient.getProducts();
//    }


    public String createOrder(Integer customerId){
            CustomerResponse  customerResponse = customerClient.getCustomerById(customerId);
            if(customerResponse != null){
                String  nameCustomer = customerResponse.getName() + " " + customerResponse.getLastName();
                String addresCustomer = customerResponse.getAddress();
                return " order from customer : " + nameCustomer + " " + addresCustomer;

            } else{
                return  "Cliente no encontrado";
            }
        }


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
