package org.example;

public class Realizetype implements Cloneable{

    public Realizetype(){
        System.out.println("调用构造方法");
    }
    public Realizetype clone() throws CloneNotSupportedException{
        System.out.println("拷贝成功");
        return (Realizetype)super.clone();
    }
}
