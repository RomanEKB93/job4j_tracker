package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int num) {
        return num - x;
    }

    public int divide(int num) {
        return num / x;
    }

    public int sumAllOperation(int num) {
        return this.multiply(num) + this.divide(num) + Calculator.minus(num) + Calculator.sum(num);
    }

    public static void main(String[] args) {
        int rsl = Calculator.sum(15);
        System.out.println(rsl);
        rsl = Calculator.minus(15);
        System.out.println(rsl);
        Calculator calculator = new Calculator();
        rsl = calculator.multiply(15);
        System.out.println(rsl);
        rsl = calculator.divide(15);
        System.out.println(rsl);
        rsl = calculator.sumAllOperation(15);
        System.out.println(rsl);
    }
}
