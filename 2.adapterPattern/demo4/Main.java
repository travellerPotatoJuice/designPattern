package org.example;


public class Main {
    public static void main(String[] args) throws Exception {
        Computer computer = new Computer();
        SDCard sdCard = new SDCardImpl();
        SDAdapter sdAdapter = new SDAdapter(new TFCardImpl());
        //读取SD卡中的内容并打印
        String msg = computer.readSD(sdCard);
        System.out.println(msg);
        //向SD卡中写入内容
        computer.write(sdCard,msg);
        System.out.println("================");
        //读取TF卡中的内容并打印
        String msg1 = computer.readSD(sdAdapter);
        System.out.println(msg1);
        //向TF卡中写入内容
        computer.write(sdAdapter,msg1);


    }



}


