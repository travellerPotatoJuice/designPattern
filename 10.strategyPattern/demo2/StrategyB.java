package org.example;

/**
 * 具体策略
 */
public class StrategyB implements Strategy{
    @Override
    public void show() {
        System.out.println("show strategy B");
    }
}
