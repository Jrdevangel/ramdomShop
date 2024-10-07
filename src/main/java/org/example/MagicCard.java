package org.example;

import java.math.BigDecimal;

public class MagicCard extends Product implements Colorable, Ageable {

    protected Color color;
    protected Integer age;

    public MagicCard(String name){
        super(name);
    }

    public MagicCard(String name, Color color, Integer age){

        super(name, 1.0);
        this.color = color;
        this.age = age;
    }

    @Override
    public MagicCard setAge(Integer age){
        this.age = age;
        return this;
    }

    @Override
    public Integer getAge(){

        return this.age;
    }

    @Override
    public MagicCard setColor(Color color){
        this.color = color;
        return this;
    }

    @Override
    public Color getColor(){
        return this.color;
    }

    @Override
    public BigDecimal getPrice(){

        return switch(this.color){
            case BLUE -> this.age > 10 ? BigDecimal.valueOf(2.5) : BigDecimal.valueOf(5.0);
            case RED -> this.age > 10 ? BigDecimal.valueOf(1.75) : BigDecimal.valueOf(3.5);
            case GREEN -> this.age > 20 ? BigDecimal.valueOf(4.4 * 1.2) : BigDecimal.valueOf(4.4);
            case BLACK -> this.age > 20 ? BigDecimal.valueOf(6.8 * 1.2) : BigDecimal.valueOf(6.8);
            case BROWN -> BigDecimal.valueOf(2.0);
            default -> this.basePrice;
        };
    }   
}