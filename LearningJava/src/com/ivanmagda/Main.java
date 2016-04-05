package com.ivanmagda;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Player ivan = new Player("Ivan", 2);
        System.out.println(ivan.getName());

        ivan.setLevel(5);
        System.out.println(ivan.getLevel());

        System.out.println(ivan.getName() + " level: " + ivan.getLevel() + " weapon: " + ivan.getWeapon().getName());

        ivan.setWeapon(new Weapon("AK-47", 100, 100));
        System.out.println(ivan.getWeapon().getName());

        InventoryItem redPotion = new InventoryItem("Red Potion", ItemType.Potion);
        ivan.addInventoryItem(redPotion);
        ivan.addInventoryItem(new InventoryItem("Chest Armor", ItemType.Armor));
        ivan.addInventoryItem(new InventoryItem("Ring of Protection", ItemType.Ring));
        ivan.addInventoryItemAtIndex(new InventoryItem("Invisibility Potion", ItemType.Potion), 0);

        if (ivan.removeInventoryItem(redPotion)) {
            System.out.println("Item was successufully deleted.");
        } else {
            System.out.println("Item was't deleted.");
        }

        ArrayList<InventoryItem> items = ivan.getInventoryItems();
        for (InventoryItem item: items) {
            System.out.println(item.getName());
        }
    }

}
