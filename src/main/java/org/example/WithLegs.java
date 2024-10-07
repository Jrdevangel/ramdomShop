package org.example;

public interface WithLegs {

    public Integer getNumOfLegs();
    public WithLegs setNumOfLegs(Integer legs);
    public WithLegs setPricePerLeg(Double price);
    public Double getPricePerLeg();
}