package org.example;

import java.io.*;
import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) throws Exception {
        CoffeeStore coffeeStore = new CoffeeStore();
        coffeeStore.orderCoffee("Americano");
        coffeeStore.orderCoffee("Latte");

    }

}

