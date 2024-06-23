package org.example;

/**
 * 具体工厂
 */
public class AmericanoFactory implements CoffeeFactory{

    @Override
    public Coffee createCoffee() {
        return new Americano();
    }
}
