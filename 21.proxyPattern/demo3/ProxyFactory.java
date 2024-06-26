package org.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 获取代理对象的工厂方法
 */
public class ProxyFactory{

    private TrainStation station = new TrainStation();

    //通过jdk提供的工厂方法获取代理对象
    /*
        ClassLoader loader : 类加载器
        Class<?>[] interfaces : 代理类实现的接口的字节码对象
        InvocationHandler h : 代理对象的调用处理程序
     */
    public SellTickets getProxyObject(){
        SellTickets proxyObject = (SellTickets) Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                new InvocationHandler() {
                    /**
                     * Object proxy : 代理对象
                     * Method method : 对接口中的方法进行了封装的method对象
                     * Object[] args : 调用方法的实际参数
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("代售点收取一定的服务费用（jdk动态代理）");
                        Object obj = method.invoke(station, args);
                        return null;
                    }
                }
        );
        return proxyObject;
    }
}
