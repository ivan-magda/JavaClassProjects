package com.ivanmagda;

/**
 * Created by ivanmagda on 27.02.16.
 */
public class Soldier extends Enemy {

    public Soldier(int lives, int hitPoints) {
        super(lives, hitPoints);
    }

    @Override
    public String toString() {
        return "Soldier{" + super.toString() + '}';
    }
}
