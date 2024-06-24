package org.example.impl;

import org.example.inter.Dessert;

public class Trimisu extends Dessert {

    @Override
    public void show() {
        System.out.println("This is Trimisu");
    }

    @Override
    public String getName() {
        return "Trimisu";
    }
}
