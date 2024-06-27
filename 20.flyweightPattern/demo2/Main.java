package org.example;


import sun.plugin2.os.windows.Windows;

import java.awt.*;

public class Main {
    public static void main(String[] args) throws Exception {
        AbstractBox box1 = BoxFactory.getInstance().getShape("I");
        box1.display("red");

        AbstractBox box2 = BoxFactory.getInstance().getShape("L");
        box2.display("blue");

        AbstractBox box3 = BoxFactory.getInstance().getShape("O");
        box3.display("yellow");

        AbstractBox box4 = BoxFactory.getInstance().getShape("O");
        box3.display("green");

        //判断是否共享了O图形的shape
        System.out.println(box3 == box4);


    }



}


