package org.example;


import sun.plugin2.os.windows.Windows;

import java.awt.*;

public class Main {
    public static void main(String[] args) throws Exception {
        AbstractVegetable abstractVegetable1 = new Cabbage();
        abstractVegetable1.cookProcess();

        AbstractVegetable abstractVegetable2 = new Greens();
        abstractVegetable2.cookProcess();


    }



}


