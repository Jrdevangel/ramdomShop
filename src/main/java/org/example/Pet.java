package org.example;

import java.math.BigDecimal;

public class Pet extends Product implements Colorable, Stinky, WithLegs {

    protected Color color;
    protected Boolean stinky = false;
    protected Integer numOfLegs = 0;
    protected PetType petType = PetType.TERRESTRIAL;
    protected Double pricePerLeg = 4.2;

    public Pet(String name, Integer numOfLegs){
        super(name);
        this.numOfLegs = numOfLegs;
    }

    public Pet(String name, Double basePrice, Integer numOfLegs, Color color, Boolean stinky){

        super(name, basePrice);
        this.color = color;
        this.stinky = stinky;
        this.numOfLegs = numOfLegs;
        
    }

    public Pet(String name, BigDecimal basePrice, Integer numOfLegs, Color color, Boolean stinky){

        super(name, basePrice);
        this.color = color;
        this.stinky = stinky;
        this.numOfLegs = numOfLegs;
        
    }

    public Pet(String name, Double basePrice, Integer numOfLegs, Color color, Boolean stinky, PetType petType){

        super(name, basePrice);
        this.color = color;
        this.stinky = stinky;
        this.numOfLegs = numOfLegs;
        this.petType = petType;
        
    }

    public Pet(String name, BigDecimal basePrice, Integer numOfLegs, Color color, Boolean stinky, PetType petType){

        super(name, basePrice);
        this.color = color;
        this.stinky = stinky;
        this.numOfLegs = numOfLegs;
        this.petType = petType;
        
    }

    public Pet setPetType(PetType petType){
        this.petType = petType;
        return this;
    }

    public PetType getPetType(){
        return this.petType;
    }

    @Override
    public Pet setColor(Color color){
        this.color = color;
        return this;
    }

    @Override
    public Color getColor(){
        return this.color;
    }

    @Override
    public Pet seStinky(Boolean stinky){

        this.stinky = stinky;
        return this;
    }

    @Override
    public Boolean isStinky(){
        return this.stinky;
    }

    @Override
    public Pet setPricePerLeg(Double price){
        this.pricePerLeg = price;
        return this;
    }

    @Override
    public Double getPricePerLeg(){
        return this.pricePerLeg;
    }

    @Override
    public Pet setNumOfLegs(Integer legs){
        this.numOfLegs = legs;
        return this;
    }

    @Override
    public Integer getNumOfLegs(){
        return this.numOfLegs;
    }

    @Override
    public BigDecimal getPrice(){
        
        if(this.petType == PetType.TERRESTRIAL){
            Double pricePerLeg = this.getPricePerLeg();
            if(this.color == Color.RED){
                pricePerLeg += 2;
            } else if(this.color == Color.GOLD){
                pricePerLeg += 3;
            }

            return BigDecimal.valueOf(pricePerLeg * this.getNumOfLegs() / (this.isStinky() ? 2 : 1));
        }

        return switch(this.color){
            case BLUE -> BigDecimal.valueOf(0.1);
            case GOLD -> BigDecimal.valueOf(100);
            default -> this.basePrice;
        };
    }   
}