package ru.job4j.oop;

public class Transportation {

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
