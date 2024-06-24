package org.example.factory;

import org.example.impl.Latte;
import org.example.impl.Trimisu;
import org.example.inter.Coffee;
import org.example.inter.Dessert;

public class ItalianDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new Latte();
    }

    @Override
    public Dessert createDessert() {
        return new Trimisu();
    }
}
