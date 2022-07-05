package ru.job4j.pojo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;

public class Student {
    private String fullName;
    private String group;
    Calendar beginingDate;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Calendar getBeginingDate() {
        return beginingDate;
    }

    public void setBeginingDate(Calendar beginingDate) {
        this.beginingDate = beginingDate;
    }
}
