package org.example;

/**
 * 抽象构造者
 */
public abstract class Builder {

    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void builderSeat();

    public abstract Bike createBike();


}
