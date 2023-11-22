package com.example.coffeeprojectmar.FactoryMethod;

import com.example.coffeeprojectmar.FactoryMethod.CoffeeProduct;

public class Espresso implements CoffeeProduct {

    @Override
    public String getProductName() {
        return "This is a Espresso";
    }

    @Override
    public double getPrice() {
        return 2.5;
    }
}
