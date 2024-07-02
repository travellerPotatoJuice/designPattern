package org.example;

/**
 * 实体类，用来实现文件类和文件夹类的一致性
 */
public abstract class Entry {

    protected String name;
    protected int size;

    public Entry(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public abstract int getSize();

    protected abstract void printList(String prefix);

    //方法一：Entry类中声明为抽象方法，由File类和Directory类分别实现。但若要添加新的子类，会增加代码重复率
    //方法二：Entry类中抛出异常，如果将来添加了其他类，默认继承，需要额外操作再重写。
    public Entry add(Entry entry) throws FileTreatmentException{
        throw new FileTreatmentException();
    }

    //模板方法模式，定义了算法框架，将具体步骤推迟到子类中实现
    public void printList(){
        printList("");
    }

    //模板方法模式，定义了算法框架，将具体步骤推迟到子类中实现
    public String toString(){
        return getName()+"("+getSize()+")";
    }





}
