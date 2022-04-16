package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNegativeNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-5, 8, 12, -34, 0, 44, 10, -87, -92, -45, 76, -12, 90, -6, 0);
        List<Integer> positive = numbers.stream().filter(x -> x > 0).collect(Collectors.toList());
        positive.forEach(System.out::println);
    }
}