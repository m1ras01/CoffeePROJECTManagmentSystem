package com.example.coffeeprojectmar.ChainOfResponsibility;
public interface DiscountHandler {
    void applyDiscount(double originalPrice);
    void setNextHandler(DiscountHandler nextHandler);
}
