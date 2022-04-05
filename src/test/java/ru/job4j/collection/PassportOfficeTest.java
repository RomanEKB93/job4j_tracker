package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PassportOfficeTest {
    @Test
    public void whenGetIsCorrect() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport()), is(citizen));
    }

    @Test
    public void whenAddIsTrue() {
        PassportOffice office = new PassportOffice();
        office.add(new Citizen("234213", "Ivan Petrov"));
        boolean out = office.add(new Citizen("324325", "Petr Ivanov"));
        assertTrue(out);
    }

    @Test
    public void whenAddIsFalse() {
        PassportOffice office = new PassportOffice();
        office.add(new Citizen("234213", "Ivan Petrov"));
        office.add(new Citizen("324325", "Petr Ivanov"));
        boolean out = office.add(new Citizen("234213", "Ivan Petrov"));
        assertFalse(out);
    }

}