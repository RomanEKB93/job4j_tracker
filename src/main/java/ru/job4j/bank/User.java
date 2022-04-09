package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс содержит основные сведения о клиенте банка,
 * реализует соответствующую модель данных.
 * @author ROMAN SHEVCHENKO
 * @version 1.0
 */
public class User {
    /**
     * Строковое представление паспортных данных клиента.
     */
    private String passport;
    /**
     * Ф.И.О. клиента банка.
     */
    private String username;

    /**
     * Создает клиента банка с заданными паспортными данными и Ф.И.О.
     * @param passport паспортные данные нового клиента банка
     * @param username Ф.И.О. нового клиента банка
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Возвращает паспортные данные этого клиента банка
     * @return паспортные данные этого клиента банка
     */
    public String getPassport() {
        return passport;
    }

     /**
     * Устанавливает для этого клиента банка новые паспортные данные,
     * полученные в качестве аргумента метода.
     * @param passport новые паспортные данные этого клиента банка
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Возвращает Ф.И.О. этого клиента банка
     * @return Ф.И.О. этого клиента банка
     */
    public String getUsername() {
        return username;
    }

    /**
     * Устанавливает для этого клиента банка новые Ф.И.О.,
     * полученные в качестве аргумента метода.
     * @param username новые Ф.И.О. этого клиента банка
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Выполняет проверку равенства данного экземпляра User
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
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    /**
     * Возвращает хэш-код для данного экземпляра User.
     * @return хэш-код для данного экземпляра User
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
