package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * 订单类
 */
public class Order {

    private int diningTable;

    private Map<String,Integer> foodDir = new HashMap<>();

    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodDir() {
        return foodDir;
    }

    public void setFoodDir(String name, int num) {
        foodDir.put(name,num);
    }
}
