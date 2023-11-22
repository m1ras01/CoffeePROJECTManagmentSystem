package com.example.coffeeprojectmar.FactoryMethod;

import com.example.coffeeprojectmar.Decorator.Coffee;

public class SimpleCoffee implements Coffee {
    @Override
    public String getDescription(){
        return "Simple coffee";
    }
    @Override
    public double cost(){
        return 2.0;
    }
}
