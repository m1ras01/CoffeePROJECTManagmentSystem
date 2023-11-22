package com.example.coffeeprojectmar.State;

import com.example.coffeeprojectmar.Observer.CoffeeOrder;

public class CompletedState implements OrderState {
    @Override
    public void handleState(CoffeeOrder context){
        System.out.println("Order completed, Thank you!!!");
    }
}
