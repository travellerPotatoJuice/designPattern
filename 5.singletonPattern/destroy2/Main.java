package org.example;

import java.io.*;
import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) throws Exception {
        Class<Singleton> clazz = Singleton.class;
        Constructor constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton instance1 = (Singleton) constructor.newInstance();
        Singleton instance2 = (Singleton) constructor.newInstance();
        System.out.println(instance1 == instance2);
    }

}

