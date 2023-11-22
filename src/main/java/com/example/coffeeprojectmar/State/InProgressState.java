package com.example.coffeeprojectmar.State;

import com.example.coffeeprojectmar.Observer.CoffeeOrder;

public class InProgressState implements OrderState {
    @Override
    public void handleState(CoffeeOrder context){
        System.out.println("Order in progress. Brewing coffee...");
        context.setOrderState(new CompletedState());
    }
}
