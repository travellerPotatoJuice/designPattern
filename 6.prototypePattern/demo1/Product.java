package org.example;


/**
 * 继承自Cloneable接口，作为原型用于复制现有实例
 */
public interface Product extends Cloneable{

    void use(String s);

    Product createClone();
}
