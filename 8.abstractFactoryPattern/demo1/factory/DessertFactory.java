package org.example.factory;

import org.example.inter.Coffee;
import org.example.inter.Dessert;


/**
 * 抽象工厂
 */
public interface DessertFactory {
    Coffee createCoffee();

    Dessert createDessert();
}

