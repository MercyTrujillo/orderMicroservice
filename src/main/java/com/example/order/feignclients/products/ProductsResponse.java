package com.example.order.feignclients.products;


import com.example.order.feignclients.pricing.PricingResponse;

public class ProductsResponse {

    private String productName;
    private String description;

    private PricingResponse pricingId;

    public ProductsResponse(String productName, String description, PricingResponse pricingId) {
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

    public PricingResponse getPricingId() {
        return pricingId;
    }

    public void setPricingId(PricingResponse pricingId) {
        this.pricingId = pricingId;
    }
}
