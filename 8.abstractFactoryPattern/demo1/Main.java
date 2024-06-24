package org.example;

import org.example.factory.AmericanDessertFactroy;
import org.example.factory.ItalianDessertFactory;
import org.example.inter.Coffee;
import org.example.inter.Dessert;

public class Main {
    public static void main(String[] args) throws Exception {

        //使用意大利甜品风味工厂，创建意大利风味甜品
        ItalianDessertFactory factory = new ItalianDessertFactory();
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();
        System.out.println("coffee:"+coffee.getName());
        System.out.println("dessert:" + dessert.getName());

        //使用美式甜品风味工厂，创建美式风味甜品
        AmericanDessertFactroy factory1 = new AmericanDessertFactroy();
        Coffee coffee1 = factory1.createCoffee();
        Dessert dessert1 = factory1.createDessert();
        System.out.println("coffee:"+coffee1.getName());
        System.out.println("dessert:" + dessert1.getName());

    }

}

