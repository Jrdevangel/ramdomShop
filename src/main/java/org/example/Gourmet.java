package org.example;

import java.math.BigDecimal;

public class Gourmet extends Product implements Ageable, Stinky {

    protected Integer age = 0;
    protected Boolean stinky = false;

    public Gourmet(String name){
        super(name);
    }

    public Gourmet(String name, Double basePrice, Integer age, Boolean stinky){

        super(name, basePrice);
        this.age = age;
        this.stinky = stinky;
    }

    public Gourmet(String name, BigDecimal basePrice, Integer age, Boolean stinky){

        super(name, basePrice);
        this.age = age;
        this.stinky = stinky;
    }

    @Override
    public Gourmet setAge(Integer age){
        this.age = age;
        return this;
    }

    @Override
    public Integer getAge(){

        return this.age;
    }

    @Override
    public Gourmet seStinky(Boolean stinky){

        this.stinky = stinky;
        return this;
    }

    @Override
    public Boolean isStinky(){
        return this.stinky;
    }

    @Override
    public BigDecimal getPrice(){

        return this.basePrice.multiply(BigDecimal.valueOf(this.age));
    }   
}