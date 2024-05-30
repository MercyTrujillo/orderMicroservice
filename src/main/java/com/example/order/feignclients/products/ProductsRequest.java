package com.example.order.feignclients.products;


import com.example.order.feignclients.pricing.PricingRequest;
import com.example.order.feignclients.pricing.PricingResponse;

public class ProductsRequest {

    private String productName;
    private String description;

    private PricingRequest pricingId;

    public ProductsRequest(String productName, String description, PricingRequest pricingId) {
        this.productName = productName;
        this.description = description;
        this.pricingId = pricingId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PricingRequest getPricingId() {
        return pricingId;
    }

    public void setPricingId(PricingRequest pricingId) {
        this.pricingId = pricingId;
    }
}
