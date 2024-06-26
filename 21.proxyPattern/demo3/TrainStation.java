package org.example;

/**
 * 具体主题类,客户端真正要访问的对象
 */
public class TrainStation implements SellTickets{

    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
