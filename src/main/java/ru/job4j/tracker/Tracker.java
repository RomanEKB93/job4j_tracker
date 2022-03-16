package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findAll() {
        Item[] rsl = new Item[size];
        int rslSize = 0;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item != null) {
                rsl[rslSize] = item;
                rslSize++;
            }
        }
        return Arrays.copyOf(rsl, rslSize);
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[size];
        int rslSize = 0;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item != null && key.equals(item.getName())) {
                rsl[rslSize] = item;
                rslSize++;
            }
        }
        return Arrays.copyOf(rsl, rslSize);
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        if (index != -1) {
            item.setId(items[index].getId());
            items[index] = item;
            return true;
        } else {
            return false;
        }
    }

}