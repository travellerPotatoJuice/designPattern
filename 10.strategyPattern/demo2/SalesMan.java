package org.example;

/**
 * 上下文
 */
public class SalesMan {
    private Strategy strategy;

    public SalesMan(Strategy strategy){
        this.strategy = strategy;
    }

    public void salesManShow(){
        strategy.show();
    }

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }
}
