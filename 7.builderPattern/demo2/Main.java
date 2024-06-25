package org.example;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Director director = new Director(new MobileBuilder());
        Bike bike1 = director.construct();
        System.out.println(bike1.getFrame());
        System.out.println(bike1.getSeat());
    }

}

