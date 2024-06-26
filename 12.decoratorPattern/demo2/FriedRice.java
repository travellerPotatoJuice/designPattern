package org.example;

/**
 * 具体构件角色,准备接收附加责任的对象
 */
public class FriedRice extends FastFood{
    public FriedRice(){
        super(10,"炒饭");
    }

    public float cost(){
        return getPrice();
    }
}
