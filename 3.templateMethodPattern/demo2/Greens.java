package org.example;

/**
 * 具体子类
 */
public class Greens extends AbstractVegetable{
    @Override
    public void pourVegetable() {
        System.out.println("倒入青菜");
    }

    @Override
    public void pourSource() {
        System.out.println("加入酱油");
    }
}
