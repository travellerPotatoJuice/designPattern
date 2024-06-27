package org.example;

/**
 * 模板类
 */
public abstract class AbstractVegetable {
    /**
     * 模板方法
     */
    public void cookProcess(){
        System.out.println("======开始炒菜======");
        pourOil();
        heatOil();
        pourVegetable();
        pourSource();
        fry();
        System.out.println("======结束炒菜======");
    };

    public void pourOil(){
        System.out.println("倒油");
    };


    public void heatOil(){
        System.out.println("热油");
    };

    /**
     * 抽象方法
     */
    public abstract void pourVegetable();

    /**
     * 抽象方法
     */
    public abstract void pourSource();

    public void fry(){
        System.out.println("不停翻炒");
    };
}
