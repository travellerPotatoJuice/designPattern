package org.example;


public class Main {
    public static void main(String[] args) throws Exception {
        //创建原型对象
        Realizetype realizetype = new Realizetype();

        //调用克隆方法
        Realizetype clone = realizetype.clone();

        //判断构造出的是否是同一个对象
        System.out.println(clone == realizetype);

    }

}

