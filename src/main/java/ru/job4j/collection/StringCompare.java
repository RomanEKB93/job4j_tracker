package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int leftLength = left.length();
        int rightLength = right.length();
        int minLength = leftLength < rightLength ? leftLength : rightLength;
        int index = 0;
        while (index < minLength) {
            int charCompare = Character.compare(left.charAt(index),
                                                right.charAt(index));
            if (charCompare != 0) {
                return charCompare;
            }
            index++;
        }
        return Integer.compare(leftLength, rightLength);
    }
}
