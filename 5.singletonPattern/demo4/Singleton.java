package org.example;

/**
 * 单例模式
 * 懒汉式，基于synchronized锁
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
     * 直接加锁，如果创建实例的过程比较复杂，效率就不够高
     **/
    public synchronized static Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }
}
