package org.example;

import javax.swing.*;
import java.util.HashMap;

public class BoxFactory {

    private static BoxFactory boxFactory = new BoxFactory();
    private HashMap<String,AbstractBox> map;

    private BoxFactory(){
        map = new HashMap<>();
        map.put("I",new IBox());
        map.put("L",new LBox());
        map.put("O",new OBox());
    }

    public static BoxFactory getInstance(){
        return boxFactory;
    }

    public AbstractBox getShape(String name){
        return map.get(name);
    }


}
