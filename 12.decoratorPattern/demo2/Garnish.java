package org.example;

/**
 * 抽象装饰者角色，包含具体构件的实例，通过其子类扩展具体构件的功能
 */
public abstract class Garnish extends FastFood{
    private FastFood fastFood;

    public Garnish(FastFood fastFood, float price, String desc){
        super(price,desc);
        this.fastFood = fastFood;
    }

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }


}
