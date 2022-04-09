package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс содержит основные атрибуты банковского
 * счета, реализует соответствующую модель данных.
 * @author ROMAN SHEVCHENKO
 * @version 1.0
 */
public class Account {
    /**
     * Строковое представление реквизитов банковского счета.
     */
    private String requisite;
    /**
     * Текущий баланс банковского счета - число типа double
     */
    private double balance;

    /**
     * Создает банковский счет с заданными реквизитами и начальным балансом
     * @param requisite реквизиты банковского счета
     * @param balance начальный баланс банковского счета
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Возвращает реквизиты данного банковского счета
     * @return реквизиты данного банковского счета
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Устанавливает для данного банковского счета реквизиты,
     * полученные в качестве аргумента метода.
     * @param requisite новые реквизиты данного банковского счета
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Возвращает баланс данного банковского счета
     * @return баланс данного банковского счета
     */
    public double getBalance() {
        return balance;
    }

    /**
     *  Устанавливает для данного банковского счета баланс,
     *  полученный в качестве аргумента метода.
     * @param balance новый баланс данного банковского счета
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Выполняет проверку равенства данного экземпляра Account
     * экземпляру, полученному в качестве аргумента
     * @param o объект, с которым производится сравнение
     * @return true в случае равенства данного экземпляра и аргумента метода; false - в противном случае
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    /**
     * Возвращает хэш-код для данного экземпляра Account.
     * @return хэш-код для данного экземпляра Account
     */
    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
