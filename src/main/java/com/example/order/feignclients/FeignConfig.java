package com.example.order.feignclients;

import feign.Logger;
import org.springframework.cloud.openfeign.FeignContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    @Bean
    public FeignContext feignContext(){
        return new FeignContext();
    }

    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
}
}
