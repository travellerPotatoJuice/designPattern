package org.example.factory;

import org.example.impl.Americano;
import org.example.impl.MatchaMousse;
import org.example.inter.Coffee;
import org.example.inter.Dessert;

public class AmericanDessertFactroy implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new Americano();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
