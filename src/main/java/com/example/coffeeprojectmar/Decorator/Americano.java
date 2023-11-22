package com.example.coffeeprojectmar.Decorator;

import com.example.coffeeprojectmar.Decorator.Coffee;

public class Americano implements Coffee {
    @Override
    public String getDescription() {
        return "This is a Americano";
    }

    @Override
    public double cost() {
        return 2.5;
    }
}
