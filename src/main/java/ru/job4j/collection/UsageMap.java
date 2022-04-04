package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("oma170@hotmail.com", "Roman Ivanovich Shevchenko");
        map.put("vasyapupkin@mail.ru", "Vasilyi Ksenofontovich Pupkin");
        map.put("murka@gmail.com", "Marusia Markovna Klimova");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
