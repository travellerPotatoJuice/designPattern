package org.example;

import java.io.*;
import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) throws Exception {

        CoffeeStore coffeeStore = new CoffeeStore();
        CoffeeFactory factory = new AmericanoFactory();
        coffeeStore.setFactory(factory);
        Coffee coffee = coffeeStore.orderCoffee();
        System.out.println(coffee.getName());
    }

}

