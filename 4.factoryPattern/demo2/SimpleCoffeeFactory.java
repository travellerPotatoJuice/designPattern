package org.example;

public class SimpleCoffeeFactory {

    public Coffee createCoffee(String type){
        Coffee coffee;
        if("Americano".equals(type)){
            coffee =  new Americano();
        }

        else if("Latte".equals(type)){
            coffee =  new Latte();
        }else{
            throw new RuntimeException();
        }
        return coffee;
    }
}
