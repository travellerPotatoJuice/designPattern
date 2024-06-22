package org.example;

/**
 * 单例模式
 * 饿汉式
 */
public class Singleton {

    /**
     * 声明为private防止从外部直接获得实例
     * static使类加载时就生成实例
     */
    private static Singleton instance = new Singleton();

    /**
     * 防止从外部调用构造函数
     */
    private Singleton(){

    }

    /**
     * 外部无法创建对象，只能调用静态方法
     * @return
     */
    public static Singleton getInstance(){
        return instance;
    }



}
