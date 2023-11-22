package com.example.coffeeprojectmar.Strategy;

public class CappuccinoBrewing implements CoffeeBrewingStrategy {
    @Override
    public void brewCoffee(){
        System.out.println("Brewing Cappuccino...");
    }
}
