package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String oword : origin) {
            check.add(oword);
        }
        for (String tword : text) {
            if (!check.contains(tword)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
