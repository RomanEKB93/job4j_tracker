package ru.job4j.oop;

public class Train implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName()
                + " передвигается по рельсам");
    }

    @Override
    public double maxVelocity() {
        return 250;
    }
}
