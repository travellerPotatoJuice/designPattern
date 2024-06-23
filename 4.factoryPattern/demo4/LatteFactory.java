package org.example;

/**
 * 具体工厂
 */
public class LatteFactory implements CoffeeFactory{

    @Override
    public Coffee createCoffee() {
        return new Latte();
    }
}
