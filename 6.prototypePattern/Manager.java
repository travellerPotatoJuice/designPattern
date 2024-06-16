package org.example;

import java.util.HashMap;

public class Manager {
    private HashMap<String,Product> showcase = new HashMap<>();
    public void register(String name, Product proto){
        this.showcase.put(name, proto);
    }

    public Product create(String protoname){
        Product p = showcase.get(protoname);
        return p.createClone();
    }
}
