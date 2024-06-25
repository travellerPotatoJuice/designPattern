package org.example;

/**
 * 指挥者类
 */
public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    /**
     * 如果构建的方法比较简单，则可以合并到Builder里面
     * 如果比较复杂，根据单一职责原则，建议还是创建一个类用于构建
     * @return
     */
    public Bike construct(){
        builder.buildFrame();
        builder.builderSeat();
        return builder.createBike();
    }
}
