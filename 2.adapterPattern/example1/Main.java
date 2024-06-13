package org.example;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        //main调用的是Print的接口
        p.printWeak();
        p.printStrong();
    }
}