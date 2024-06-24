package org.example.impl;

import org.example.inter.Dessert;

public class MatchaMousse extends Dessert {

    @Override
    public void show() {
        System.out.println("This is Match Mousse");
    }

    @Override
    public String getName() {
        return "MatchMousse";
    }
}
