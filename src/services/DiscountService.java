package services;

import entities.Product;

public class DiscountService {
    private DiscountCalculator calculator;

    //? Constructor 
    public DiscountService(){
        this.calculator = new DiscountCalculator();
    }

    public double calculateDiscountedPrice(Product product, double discountedPercentage){
        return calculator.calculateDiscount(product, discountedPercentage);
    }
    
}
