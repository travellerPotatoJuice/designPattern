package org.example.impl;

import org.example.inter.Product;

public class IDCard extends Product {
    private String owner;
    public IDCard(String owener){
        this.owner = owener;
        System.out.println("make "+owener+ "'s ID card ");
    }



    @Override
    public void use() {
        System.out.println("use "+owner+ "'s ID card ");
    }

    public String getOwner(){
        return this.owner;
    }
}
