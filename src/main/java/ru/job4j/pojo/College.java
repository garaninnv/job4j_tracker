package ru.job4j.pojo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class College {
    public static void main(String[] args) {
        Student ivanov = new Student();
        ivanov.setFullName("Ivanov Ivan Ivanovich");
        ivanov.setGroup("22B");
        ivanov.setBeginingDate(new GregorianCalendar(2021, Calendar.SEPTEMBER, 1));
        SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Full name - " + ivanov.getFullName()
                + ". Group - " + ivanov.getGroup() + ". Begining date - "
                + formater.format(ivanov.getBeginingDate().getTime()));
    }
}
