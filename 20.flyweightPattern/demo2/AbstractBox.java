package org.example;

/**
 * 抽象享元
 */
public abstract class AbstractBox {

    public abstract String getShape();

    public void display(String color){
        System.out.println("shape: " + getShape() + ",color: "+color);
    }
}
