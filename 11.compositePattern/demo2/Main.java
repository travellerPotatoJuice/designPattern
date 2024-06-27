package org.example;


import sun.plugin2.os.windows.Windows;

public class Main {
    public static void main(String[] args) throws Exception {
        //创建菜单树
        MenuComponent menu1 = new Menu("menu manager",2);
        menu1.add(new MenuItem("edit menu",3));
        menu1.add(new MenuItem("add menu",3));
        menu1.add(new MenuItem("remove menu",3));

        MenuComponent menu2 = new Menu("level manager",2);
        menu2.add(new MenuItem("visit page",3));
        menu2.add(new MenuItem("control page",3));

        MenuComponent menu3 = new Menu("role manager",2);
        menu3.add(new MenuItem("add role",3));
        menu3.add(new MenuItem("remove role",3));

        MenuComponent system = new Menu("system manager",1);
        system.add(menu1);
        system.add(menu2);
        system.add(menu3);

        //打印菜单树
        system.print();
    }



}


