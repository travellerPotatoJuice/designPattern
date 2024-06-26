package org.example;

/**
 * 代理类，客户端实际访问的对象
 */
public class ProxyPoint implements SellTickets{

    //私有火车站对象，防止客户端直接访问
    private TrainStation trainStation = new TrainStation();


    @Override
    public void sell() {
        System.out.println("代售点收取代理费用");
        trainStation.sell();
    }
}
