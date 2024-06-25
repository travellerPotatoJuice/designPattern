package org.example;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product = new Product.Builder()
                .setPart1("part1")
                .setPart2("part2")
                .build();
        System.out.println(product.toString());
    }

}

