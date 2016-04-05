package com.ivanmagda;

/**
 * Created by ivanmagda on 27.02.16.
 */

enum ItemType {
    Potion,
    Ring,
    Armor
}

public class InventoryItem {

    private ItemType type;
    private String name;

    public InventoryItem() {
        super();
    }

    public InventoryItem(String name, ItemType type) {
        this();

        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

}
