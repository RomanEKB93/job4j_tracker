package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class NotifyAccountTest {
    @Test
    public void whenNoDuplicates() {
        List<Account> accounts = Arrays.asList(
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("142", "Petr Arsentev", "000001")
        );
        HashSet<Account> expect = new HashSet<>(
                Arrays.asList(
                        new Account("123", "Petr Arsentev", "eDer3432f"),
                        new Account("142", "Petr Arsentev", "000001")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }

    @Test
    public void whenHasDuplicates() {
        List<Account> accounts = Arrays.asList(
                new Account("2635", "Chipollino", "123124"),
                new Account("0923", "Chipollone", "645363"),
                new Account("8127", "Chipolletto", "234123"),
                new Account("0923", "Chipollone", "234325"),
                new Account("2635", "Chipollino", "875679")
        );
        HashSet<Account> expect = new HashSet<>(
                Arrays.asList(
                        new Account("2635", "Chipollino", "ten dollars"),
                        new Account("0923", "Chipollone", "fifteen dollars"),
                        new Account("8127", "Chipolletto", "twenty dollars")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }
}