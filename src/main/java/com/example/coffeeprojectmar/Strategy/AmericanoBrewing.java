package com.example.coffeeprojectmar.Strategy;

public class AmericanoBrewing implements CoffeeBrewingStrategy {

    @Override
    public void brewCoffee(){
        System.out.println("Brewing Americano...");
    }
}
