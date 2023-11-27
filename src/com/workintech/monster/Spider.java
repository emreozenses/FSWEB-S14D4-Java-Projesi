package com.workintech.monster;

public class Spider extends Monster implements Posion {

    public Spider(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double attack() {
        return getDamage() + (getDamage()*poison());
    }

    @Override
    public double bleed() {
        return getDamage()*0.25;
    }
}



