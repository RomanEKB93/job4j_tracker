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

    public void printErrorInfo() {
        System.out.println("Выскочила ошибка: " + this.active);
        System.out.println("Статус ошибки: " + this.status);
        System.out.println("Сообщение: " + this.message);
    }

    public static void main(String[] args) {
        Error defErr = new Error();
        Error err1 = new Error(true, 1, "Нет связи с Хьюстоном");
        Error noErr = new Error(false, 0, "Связь установлена");
        Error err2 = new Error(true, 2, "Хьюстон, у нас проблемы!");
        defErr.printErrorInfo();
        err1.printErrorInfo();
        noErr.printErrorInfo();
        err2.printErrorInfo();
    }
}
