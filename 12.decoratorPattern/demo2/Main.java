package org.example;


public class Main {
    public static void main(String[] args) throws Exception {
        FastFood friedRice = new FriedRice();
        FastFood friedNoodles = new FriedNoodles();
        System.out.println(friedRice.getDesc() + " " + friedRice.getPrice());
        System.out.println(friedNoodles.getDesc() + " " + friedNoodles.getPrice());
        System.out.println("=========");

        friedRice = new Egg(friedRice);
        friedNoodles = new Egg(friedNoodles);
        System.out.println(friedRice.getDesc() + " " + friedRice.cost());
        System.out.println(friedNoodles.getDesc() + " " + friedNoodles.cost());

        System.out.println("=========");

        friedRice = new Bacon(friedRice);
        friedNoodles = new Bacon(friedNoodles);
        System.out.println(friedRice.getDesc() + " " + friedRice.cost());
        System.out.println(friedNoodles.getDesc() + " " + friedNoodles.cost());

    }



}


