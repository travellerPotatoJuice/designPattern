package org.example;

/**
 * 单例模式
 * 懒汉式，单线程下的实现方式
 */
public class Singleton {
    /**
     * 私有构造方法，防止外接调用
     */
    private Singleton(){}

    /**
     * 声明变量时不直接实例化
     */
    private static Singleton instance;

    public static Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }
}
