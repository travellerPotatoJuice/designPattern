package org.example;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //通过代售点调用TrainStation类对象的方法
        ProxyPoint proxyPoint = new ProxyPoint();
        proxyPoint.sell();
    }

}

