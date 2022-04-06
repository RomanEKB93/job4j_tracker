package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class ItemSortTest {
    @Test
    public void whenAscendingOrder() {
        Item item1 = new Item("employee");
        Item item2 = new Item("childhood");
        Item item3 = new Item("situation");
        Item item4 = new Item("river");
        Item item5 = new Item("scene");
        Item item6 = new Item("cheek");
        List<Item> items = Arrays.asList(item1, item2, item3,
                                         item4, item5, item6);
        List<Item> expected = Arrays.asList(item6, item2, item1,
                                            item4, item5, item3);
        Collections.sort(items, new ItemAscByName());
        Assert.assertEquals(expected, items);
    }

    @Test
    public void whenDescendingOrder() {
        Item item1 = new Item("design");
        Item item2 = new Item("barrier");
        Item item3 = new Item("admission");
        Item item4 = new Item("bare");
        Item item5 = new Item("random");
        List<Item> items = Arrays.asList(item1, item2, item3,
                                         item4, item5);
        List<Item> expected = Arrays.asList(item5, item1, item2,
                                            item4, item3);
        Collections.sort(items, new ItemDescByName());
        Assert.assertEquals(expected, items);
    }
}
