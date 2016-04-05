package com.ivanmagda;

public class Main {

    public static void main(String[] args) {
        Enemy enemy = new Enemy(3, 10);
        System.out.println(enemy);

        enemy.takeDamage(5);
        System.out.println(enemy);

        Soldier soldier = new Soldier(1, 25);
        System.out.println(soldier);

        soldier.takeDamage(11);
        System.out.println(soldier);

        SuperSoldier superSoldier = new SuperSoldier(1, 100);
        superSoldier.takeDamage(10);
        System.out.println(superSoldier);
    }

}
