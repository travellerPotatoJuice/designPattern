package org.example;


import sun.plugin2.os.windows.Windows;

import java.awt.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws Exception {
        //创建订单
        Order order = new Order();
        order.setDiningTable(1);
        order.setFoodDir("宫保鸡丁",1);
        order.setFoodDir("清炒虾仁",1);
        order.setFoodDir("米饭",2);

        //创建服务员和厨师
        Waiter waiter = new Waiter();
        Chef chef = new Chef();

        //服务员将订单委派给厨师
        waiter.setCommand(new OrderCommand(chef,order));
        waiter.orderUp();
    }



}



