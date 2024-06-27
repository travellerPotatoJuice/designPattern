package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * 容器节点
 */
public class Menu extends MenuComponent{

    private List<MenuComponent> menuComponents = new ArrayList<>();

    public Menu(String name, int level) {
        super(name, level);
    }


    @Override
    public void add(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
    };

    @Override
    public void remove(MenuComponent menuComponent){
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index){
        return menuComponents.get(index);
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void print(){
        //打印菜单
        for(int i=0;i<level;i++){
            System.out.print("--");
        }
        System.out.println(name);

        //打印子菜单/子菜单项名称
        for(MenuComponent m : menuComponents){
            m.print();
        }
    }


}
