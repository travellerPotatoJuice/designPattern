package org.example;


/**
 * 复制现有对象来创建新的对象，而不是通过实例化类并配置它们的参数来创建对象。
 * 实例的初始化过程比较复杂时，可以通过原型模式快速获取一个实例对象
 */
public class Main {
    public static void main(String[] args) {
       Manager manager = new Manager();
       UnderlinePen upen = new UnderlinePen('~');
       MessageBox mbox = new MessageBox('*');

       manager.register("strong message",upen);
       manager.register("warning box",mbox);

       //manager从hahsmap中寻找到对应的prodcut，并且进行clone
       Product p1 = manager.create("strong message");
       p1.use("Hello world");
       Product p2 = manager.create("warning box");
       p2.use("Hello world");



    }
}

