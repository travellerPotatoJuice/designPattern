package org.example;


import sun.plugin2.os.windows.Windows;

public class Main {
    public static void main(String[] args) throws Exception {
       SmartAppliancesFacade smartAppliancesFacade = new SmartAppliancesFacade();
       smartAppliancesFacade.say("开启家电");
        System.out.println("==========");
        smartAppliancesFacade.say("关闭家电");
    }



}


