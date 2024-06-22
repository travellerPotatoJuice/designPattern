package org.example;

public class Main {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        //判断两次获取的是否是同一个实例
        System.out.println(instance1 == instance2);
    }
}

