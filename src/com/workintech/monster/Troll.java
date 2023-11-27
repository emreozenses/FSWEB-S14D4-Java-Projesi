package com.workintech.monster;

public class Troll extends Monster implements Bleedable,Posion{

    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double bleed() {
        return getDamage()*0.25;
    }

    @Override
    public double attack() {
        return getDamage()+bleed()+(getDamage()*poison());
    }


}
