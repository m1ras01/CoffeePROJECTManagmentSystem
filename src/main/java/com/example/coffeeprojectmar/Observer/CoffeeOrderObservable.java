package com.example.coffeeprojectmar.Observer;

public interface CoffeeOrderObservable {
    void addObserver(CoffeeOrderObserver observer);
    void removeObserver(CoffeeOrderObserver observer);
    void notifyObserver(String status);

}
