package org.example;

/**
 * 单例模式
 * 懒汉式，基于双重检查锁
 */
public class Singleton {
    /**
     * 私有构造方法，防止外接调用
     */
    private Singleton(){}

    /**
     * 声明变量时不直接实例化，加上volatile可以防止指令重排序
     * 对象实例化：1.分配内存空间 2.初始化对象 3.将对象指向分配的内存空间
     * 如果不加volatile，指令重排后可能会导致A先执行了1 3，没有执行2。此时instance不为null，但对象没有初始化完成
     * B检查时发现instance不为null，就直接返回未初始化好的对象
     */
    private volatile static Singleton instance;

    /**
     * 减小了锁的粒度
     **/
    public static Singleton getInstance(){
        //多线程情况下不够安全，因为可能有多个线程进入if
        if(instance==null){
            //确保只能有一个线程进入同步代码块
            synchronized (Singleton.class){
                //和synchronized是阻塞锁有关，线程未竞争到锁时会加入阻塞队列
                //等待持有锁的线程释放了锁，阻塞队列中的线程也会来获取锁，因此需要二次检查
                //如果是基于自己实现的非阻塞的锁，这里可以有不一样的实现方式
                if (instance==null){
                    instance = new Singleton();
                }
            }

        }
        return instance;
    }
}
