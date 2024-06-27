package org.example;

/**
 * 具体子类
 */
public class Cabbage extends AbstractVegetable{
    @Override
    public void pourVegetable() {
        System.out.println("倒入包菜");
    }

    @Override
    public void pourSource() {
        System.out.println("倒入辣酱");
    }
}
