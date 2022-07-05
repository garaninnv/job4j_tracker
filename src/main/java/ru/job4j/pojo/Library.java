package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book javaStart = new Book("Java Start", 150);
        Book phytonStart = new Book("phyton Start", 250);
        Book cleanCode = new Book("Clean code", 300);
        Book kotlinStart = new Book("kotlin Start", 120);

        Book[] arrayBook = new Book[4];

        arrayBook[0] = javaStart;
        arrayBook[1] = phytonStart;
        arrayBook[2] = cleanCode;
        arrayBook[3] = kotlinStart;

        for (int index = 0; index < arrayBook.length; index++) {
            Book book = arrayBook[index];
            System.out.println("Имя - " + book.getName() + ". Количество страниц " + book.getCount());
        }

        Book book = arrayBook[0];
        arrayBook[0] = arrayBook[3];
        arrayBook[3] = book;

        for (Book el: arrayBook) {
            System.out.println("Имя - " + el.getName() + ". Количество страниц " + el.getCount());
        }

        for (int i = 0; i < arrayBook.length; i++) {
            if (arrayBook[i].getName().equals("Clean code")) {
                System.out.println("Книги с именем Clean code");
                System.out.println("Имя - " + arrayBook[i].getName() + ". Количество страниц " + arrayBook[i].getCount());
            }
        }
    }
}
