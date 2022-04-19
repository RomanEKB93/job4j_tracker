package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс реализует хранилище данных клиентов банка и их счетов,
 * обеспечивает операции добавления новых данных в хранилище, выборки информации
 * о ранее добавленных клиентах банка и банковских счетах, поддерживает
 * механизм совершения транзакций.
 * @author ROMAN SHEVCHENKO
 * @version 1.0
 */
public class BankService {
    /**
     * В качестве хранилища данных банка применяется контейнер типа Map,
     * ставящий в соответствие каждому клиенту банка (ключ) список его
     * банковских счетов (значение).
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Если переданный в качестве аргумента гражданин не является клиентом банка,
     * то этот метод заносит его данные в хранилище данных банка.
     * @param user гражданин, желающий стать клиентом банка
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Используя паспортные данные клиента, добавляет в список
     * его счетов счет, полученный в качестве аргумента метода.
     * Не допускает появление дубликатов в списке счетов клиента.
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user == null) {
            return;
        }
        List<Account> accounts = users.get(user);
        if (!accounts.contains(account)) {
            accounts.add(account);
        }
    }

    /**
     * Производит поиск клиента в хранилище по паспортным данным,
     * полученным в качестве аргумента метода.
     * @param passport паспортные данные клиента, которого требуется найти
     * @return объект типа User - в случае успеха поиска; null - в противном случае
     */
    public User findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(x -> x.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    /**
     * Производит поиск банковского счета в хранилище по паспортным данным
     * его владельца и реквизитам счета, полученным в качестве аргументов метода.
     * @param passport паспортные данные предполагаемого владельца счета
     * @param requisite реквизиты искомого счета
     * @return объект типа Account - в случае успеха поиска; null - в противном случае
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user == null) {
            return null;
        }
        return users.get(user)
                .stream()
                .filter(x -> x.getRequisite().equals(requisite))
                .findFirst()
                .orElse(null);
    }

    /**
     * Осуществляет денежный перевод величиной amount со счета-отправителя на счет-получателя.
     * При этом параметры счета-отправителя и счета-получателя определяются их реквизитами
     * и паспортными данными их владельцев, полученнымми в качестве аргументов метода.
     * @param srcPassport паспортные данные клиента-отправителя
     * @param srcRequisite реквизиты счета-отправителя
     * @param destPassport паспортные данные клиента-получателя
     * @param destRequisite реквизиты счета-получателя
     * @param amount сумма денежного перевода
     * @return true - в случае успеха транзакции; false - в противном случае.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null
            && srcAccount.getBalance() >= amount) {
            destAccount.setBalance(destAccount.getBalance() + amount);
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            rsl = true;
        }
        return rsl;
    }
}
