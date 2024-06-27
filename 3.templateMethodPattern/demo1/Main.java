package org.example;




public class Main {
    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('A');
        AbstractDisplay d2 = new StringDisplay("Hello, world!");
        d1.display();
        d2.display();
    }
}
