package com.example.order.feignclients.pricing;

import com.example.order.feignclients.pricing.PricingRequest;
import com.example.order.feignclients.pricing.PricingResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "pricing", url =  "http://localhost:8082/pricing")
@RequestMapping("/pricing")
public interface PricingFeignClient {

    public List<PricingResponse> pricesList();
  public PricingRequest price();
}
