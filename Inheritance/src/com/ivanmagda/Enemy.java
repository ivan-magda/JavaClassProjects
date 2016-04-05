package com.ivanmagda;

/**
 * Created by ivanmagda on 27.02.16.
 */
public class Enemy {

    private int lives;
    private int hitPoints;

    public Enemy(int lives, int hitPoints) {
        this.lives = lives;
        this.hitPoints = hitPoints;
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "hitPoints=" + hitPoints +
                ", lives=" + lives +
                '}';
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void takeDamage(int damage) {
        int remainingDamage = getHitPoints() - damage;
        setHitPoints(remainingDamage);
    }

}
