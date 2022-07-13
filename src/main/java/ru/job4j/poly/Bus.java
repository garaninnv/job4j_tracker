package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Машина едит");
    }

    @Override
    public void passengers(int count) {
        System.out.println("В машине " + count + " пассажиров");
    }

    @Override
    public double refuel(double liter) {
        return liter * 59;
    }
}
