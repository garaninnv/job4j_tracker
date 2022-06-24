package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
                System.out.println("Спокойной ночи");
        } else {
                System.out.println("Песня не найдена");
            }
    }

    public static void main(String[] args) {
        Jukebox musicPlayer = new Jukebox();
        musicPlayer.music(1);
        musicPlayer.music(2);
        musicPlayer.music(3);
    }
}
