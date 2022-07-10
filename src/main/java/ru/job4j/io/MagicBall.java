package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String inString;
        System.out.println("Введите закрытый вопрос :");
        inString = scr.nextLine();
        int answer = new Random().nextInt(3);
        if (answer == 0) {
            System.out.println(inString);
            System.out.println("Да");
        } else
            if (answer == 1) {
                System.out.println(inString);
                System.out.println("Нет");
            } else {
                System.out.println(inString);
                System.out.println("Может быть");
            }
    }
}
