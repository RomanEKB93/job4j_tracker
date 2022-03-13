package ru.job4j.inheritance;

public class Error {
    private int status;
    private String message;

    public Error() {

    }

    public Error(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}
