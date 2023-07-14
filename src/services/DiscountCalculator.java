package services;

import entities.Product;

public class DiscountCalculator {
    
    public double calculateDiscount(Product product, double discountPercentage) {
        if (discountPercentage < 0 || discountPercentage > 100) {
            throw new IllegalArgumentException("The percentage of discount must be between 1 and 100");
        }
        
        double discountAmount = product.getPrice() * (discountPercentage /100 );
        double discountedPrice = product.getPrice() - discountAmount; 
        return discountedPrice;
    }
}
