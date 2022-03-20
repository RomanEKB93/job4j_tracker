package ru.job4j.poly;

public class Bus implements Transport {
    private boolean allFit;
    private String message;
    private double fuel;

    public Bus(double fuel) {
        this.fuel = fuel;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public void drive() {
        if (fuel > 0 && allFit) {
            message = "The doors are closing. We can go!";
        } else if (fuel <= 0) {
            message = "I have no enough fuel. We can't go!";
        } else {
            message = "The bus is overwhelmed. We can't go!";
        }
    }

    @Override
    public void passengers(int quantity) {
        allFit = quantity <= 20;
    }

    @Override
    public double refuel(double amount) {
        double rsl = -1;
        if (amount >= 0) {
            fuel += amount;
            rsl = 45.0 * amount;
        }
        return rsl;
    }
}
