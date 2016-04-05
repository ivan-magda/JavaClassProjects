package com.ivanmagda;

/**
 * Created by ivanmagda on 27.02.16.
 */
public class SuperSoldier extends Enemy {

    public SuperSoldier(int lives, int hitPoints) {
        super(lives, hitPoints);
    }

    @Override
    public String toString() {
        return "SuperSoldier{" + super.toString() + '}';
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage / 2);
    }
}
