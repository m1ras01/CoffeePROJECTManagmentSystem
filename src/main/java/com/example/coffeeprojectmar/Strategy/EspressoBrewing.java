package com.example.coffeeprojectmar.Strategy;

public class EspressoBrewing implements CoffeeBrewingStrategy {
    @Override
    public void brewCoffee(){
        System.out.println("Brewing Americano...");
    }
}
