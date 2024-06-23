package org.example;

public class CoffeeStore {
    public void orderCoffee(String type){
        SimpleCoffeeFactory simpleCoffeeFactory = new SimpleCoffeeFactory();
        //不依赖于具体的咖啡对象，实现了解耦合
        Coffee coffee = simpleCoffeeFactory.createCoffee(type);
        System.out.println(coffee.getName());
        coffee.addMilk();
        coffee.addSugar();
        System.out.println("==============");
    }
}
