package org.example.impl;

import org.example.inter.Factory;
import org.example.inter.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * 工厂实现类
 */
public class IDCardFactory extends Factory {

    private List owners = new ArrayList();
    @Override
    public Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    public void registerProdcut(Product product) {
        owners.add(((IDCard)product).getOwner());
    }

    public List getOwners(){
        return owners;
    }
}
