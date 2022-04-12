package ru.job4j.lambda;

import java.util.*;

public class LazyLoad {
    public static void main(String[] args) {
        String[] names = {
                "Ivan",
                "Feudor"
        };
        Comparator<String> lengthCmp = (left, right) -> {
            System.out.println("execute comparator");
            return Integer.compare(left.length(), right.length());
        };
        Arrays.sort(names, lengthCmp);
    }
}
