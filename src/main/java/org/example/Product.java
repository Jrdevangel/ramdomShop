package org.example;

import java.math.BigDecimal;

public abstract class Product {

    protected BigDecimal basePrice;
    protected String name;

    public Product(String name){
        this.name = name;
        this.basePrice = BigDecimal.valueOf(0.0);
    }

    public Product(String name, BigDecimal basePrice) {

        this.basePrice = basePrice;
        this.name = name;
    }

    public Product (String name, Double basePrice){

        this.basePrice = BigDecimal.valueOf(basePrice);
        this.name = name;
    }

    public Product setBasePrice(BigDecimal basePrice){

        this.basePrice = basePrice;
        return this;
    }

    public Product setBasePrice(Double basePrice){

        this.basePrice = BigDecimal.valueOf(basePrice);
        return this;
    }

    public abstract BigDecimal getPrice();
}