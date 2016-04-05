package com.ivanmagda;

import java.util.ArrayList;

/**
 * Created by ivanmagda on 27.02.16.
 */

public class Player {

    // Properties

    private String name;
    private int lives;
    private int level;
    private int score;
    private Weapon weapon;
    private ArrayList<InventoryItem> inventoryItems;

    // Init

    public Player() {
        super();

        name = "Unknown player";
        lives = 3;
        level = 1;
        setDefaultWeapon();
        inventoryItems = new ArrayList<InventoryItem>();
    }

    public Player(String name) {
        this();

        setName(name);
    }

    public Player(String name, int level) {
        this();

        setName(name);
        setLevel(level);
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        if (newName.length() < 4) {
            return;

        }

        name = newName;
    }

    public int getLives() {
        return lives;
    }


    public void setLives(int newLives) {
        lives = newLives;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public ArrayList<InventoryItem> getInventoryItems() {
        return inventoryItems;
    }

    // Instance Functions

    private void setDefaultWeapon() {
        this.weapon = new Weapon("Sword", 10, 20);
    }

    public boolean addInventoryItem(InventoryItem item) {
        return inventoryItems.add(item);
    }

    public boolean addInventoryItemAtIndex(InventoryItem item, int index) {
        if (index < 0) {
            return false;
        }

        inventoryItems.add(index, item);

        return true;
    }

    public boolean removeInventoryItem(InventoryItem item) {
        return inventoryItems.remove(item);
    }

}
