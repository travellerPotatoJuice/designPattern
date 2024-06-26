package org.example;

/**
 * 抽象构件角色,为具体构件角色提供统一规范
 */
public abstract class FastFood {
    private float price;
    private String desc;

    public FastFood(){

    }

    public FastFood(float price, String desc){
        this.price = price;
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public abstract float cost();
}
