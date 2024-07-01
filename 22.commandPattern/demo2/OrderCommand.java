package org.example;

import java.util.Map;
import java.util.Set;

public class OrderCommand implements Command{
    private Chef receiver;

    private Order order;

    public OrderCommand(Chef chef, Order order){
        this.receiver = chef;
        this.order = order;
    }

    @Override
    public void execute(){
        System.out.println(order.getDiningTable() + "号桌的订单");
        System.out.println("==================");
        Map<String, Integer> foodDir = order.getFoodDir();
        //遍历map集合
        for(String s : foodDir.keySet()){
            receiver.makeFood(s,foodDir.get(s));
        }
        System.out.println("==================");
        System.out.println(order.getDiningTable() + "号桌的饭准备好了");
    }
}
