package org.example;

/**
 * 单例模式
 * 饿汉式，基于静态代码块
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

    /**
     * 同样在类加载时实例化
     * 处理更加灵活，可以增加一些自定义操作，比如可以在实例化时用try...catch环绕处理异常
     */
    static {
        instance = new Singleton();
    }
    public static Singleton getInstance(){
        return instance;
    }
}
