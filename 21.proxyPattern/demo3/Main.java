package org.example;


public class Main {
    public static void main(String[] args) throws Exception {
        //创建代理工厂
        ProxyFactory factory = new ProxyFactory();
        //获取代理对象
        SellTickets proxyObject = factory.getProxyObject();
        proxyObject.sell();
    }

}

