package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int y) {
        return y - x;
    }

    public double divide(int y) {
        return y / x;
    }

    public double sumAllOperation(int y) {
        return sum(y) + minus(y) + divide(y) + multiply(y);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(sum(10));
        System.out.println(calc.multiply(10));
        System.out.println(minus(10));
        System.out.println(calc.divide(10));
        System.out.println(calc.sumAllOperation(10));
    }
}
