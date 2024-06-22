package org.example;

public class Main {
    public static void main(String[] args) {
        //创建可执行任务
        Runnable task = ()->{
            Singleton singleton = Singleton.getInstance();
            System.out.println("thread" + Thread.currentThread().getId() + "get instance:"+singleton);
            System.out.println("=========");
        };
        //启动多线程，查看获取到的singleton实例地址
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

