package org.example;

/**
 * 组件
 */
public abstract class MenuComponent {

     protected  String name;
     protected  int level;

     public MenuComponent(String name, int level){
        this.name = name;
        this.level = level;
    }

     public void add(MenuComponent menuComponent){
         //菜单项无法调用该方法，默认抛出异常，仅在子菜单中进行实现
         throw new UnsupportedOperationException();
     };

     public void remove(MenuComponent menuComponent){
         //菜单项无法调用该方法，默认抛出异常，仅在子菜单中进行实现
         throw new UnsupportedOperationException();
     }

     public MenuComponent getChild(int index){
         //菜单项无法调用该方法，默认抛出异常，仅在子菜单中进行实现
         throw new UnsupportedOperationException();
     }

     public String getName(){
         return name;
     }

     public abstract void print();

}
