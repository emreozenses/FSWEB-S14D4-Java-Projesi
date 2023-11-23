package com.workintech.monster;

public abstract class Monster implements Bleedable, Posion{

    private String name;
    private int hitPoints;
    private  double damage;

    public Monster(String name, int hitPoints, double damage) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public double getDamage() {
        return damage;
    }

    public double attack(){
        return getDamage()+bleed()+poison();
    }
    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", damage=" + damage +
                '}';
    }
}
