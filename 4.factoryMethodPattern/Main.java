package org.example;

import org.example.impl.IDCardFactory;
import org.example.inter.Factory;
import org.example.inter.Product;

public class Main {
    public static void main(String[] args) {
        //获取工厂。
        Factory factory = new IDCardFactory();
        //不需要知道如何创建card，只需通过工厂获取实例，解耦合
        Product card1 = factory.create("Alice");
        Product card2 = factory.create("Bob");
        Product card3 = factory.create("Cindy");
        card1.use();
        card2.use();
        card3.use();
    }
}

