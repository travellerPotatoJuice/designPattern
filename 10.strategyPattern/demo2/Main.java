package org.example;


import sun.plugin2.os.windows.Windows;

import java.awt.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws Exception {
        SalesMan salesMan= new SalesMan(new StrategyA());
        salesMan.salesManShow();
        System.out.println("==========");
        salesMan.setStrategy(new StrategyB());
        salesMan.salesManShow();
        System.out.println("==========");
        salesMan.setStrategy(new StrategyC());
        salesMan.salesManShow();
    }



}



