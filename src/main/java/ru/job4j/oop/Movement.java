package ru.job4j.oop;

public class Movement {
    public static void main(String[] args) {
        Vehicle bus1 = new Bus();
        Vehicle bus2 = new Bus();
        Vehicle bus3 = new Bus();
        Vehicle plane1 = new Plane();
        Vehicle plane2 = new Plane();
        Vehicle plane3 = new Plane();
        Vehicle train1 = new Train();
        Vehicle train2 = new Train();
        Vehicle train3 = new Train();
        Vehicle[] vehicles = {bus1, bus2, bus3,
                              plane1, plane2, plane3,
                              train1, train2, train3
        };
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
            System.out.println("Максимальная скорость " + vehicle.getClass().getSimpleName()
                                + ": " + vehicle.maxVelocity());
        }
    }
}
