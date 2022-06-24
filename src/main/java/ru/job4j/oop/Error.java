package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Active : " + active);
        System.out.println("Status : " + status);
        System.out.println("Message : " + message);
    }

    public static void main(String[] args) {
        Error erDefault = new Error();
        erDefault.printInfo();
        Error erTrue = new Error(true, 12, "Error");
        erTrue.printInfo();
        Error erFalse = new Error(false, 1, "No Error");
        erFalse.printInfo();
    }
}
