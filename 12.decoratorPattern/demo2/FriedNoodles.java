package org.example;

/**
 * 具体构件角色,准备接收附加责任的对象
 */
public class FriedNoodles extends FastFood{

    public FriedNoodles(){
        super(12,"炒面");
    }
    public float cost(){
        return getPrice();
    }
}
