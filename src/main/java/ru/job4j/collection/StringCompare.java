package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int leftLength = left.length();
        int rightLength = right.length();
        int minLength = Math.min(leftLength, rightLength);
        for (int index = 0; index < minLength; index++) {
            int charCompare = Character.compare(left.charAt(index),
                                                right.charAt(index));
            if (charCompare != 0) {
                return charCompare;
            }
        }
        return Integer.compare(leftLength, rightLength);
    }
}
