package org.example;

/**
 * 单例模式
 * 懒汉式，基于静态内部类
 */
public class Singleton {
    /**
     * 私有构造方法，防止外接调用
     */
    private Singleton(){}

    /**
     * 加载外部类的过程中，不会加载内部类。
     * 只有内部类的属性/方法被调用时才会加载
     * 类加载过程是线程安全的，每个类都只会被加载一次，所以即使多线程也只会获取到一个INSTANCE
     */
    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }


    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
