package ru.job4j.oop;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Самолёт летит");
    }

    public static void main(String[] args) {
    Vehicle aerobus = new Airplane();
    Vehicle hyperloop = new Train();
    Vehicle schoolBus = new Bus();

    Vehicle[] transport = new Vehicle[] {aerobus, hyperloop, schoolBus};

        for (Vehicle el: transport) {
            el.move();
        }
    }
}
