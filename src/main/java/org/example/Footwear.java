package org.example;

import java.math.BigDecimal;

public class Footwear extends Product {

    public Footwear(String name){
        super(name);
    }

    public Footwear(String name, Double basePrice){
        super(name, basePrice);
    }

    public Footwear(String name, BigDecimal basePrice){
        super(name, basePrice);
    }

    @Override
    public BigDecimal getPrice(){

        return this.basePrice;
    }
}