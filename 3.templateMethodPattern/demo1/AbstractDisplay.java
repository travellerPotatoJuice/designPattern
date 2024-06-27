package org.example;

/**
 * 抽象类，定义的抽象方法交由子类实现
 */
public abstract class AbstractDisplay {
    public abstract void open();
    public abstract void print();

    public abstract void close();

    /**
     * 模板方法
     */
    public final void display(){
        open();
        for(int i=0;i<5;i++){
            print();
        }
        close();
    }
}
