package com.ivanmagda;

/**
 * Created by ivanmagda on 27.02.16.
 */
public class Weapon {

    // Properties

    private String name;
    private int damageInflicted;
    private int hitPoints;

    // Init

    public Weapon() {
        super();
    }

    public Weapon(String name, int damageInflicted, int hitPoints) {
        this();

        this.name = name;
        this.damageInflicted = damageInflicted;
        this.hitPoints = hitPoints;
    }

    // Getters and Setters

    public int getDamageInflicted() {
        return damageInflicted;
    }

    public void setDamageInflicted(int damageInflicted) {
        this.damageInflicted = damageInflicted;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
