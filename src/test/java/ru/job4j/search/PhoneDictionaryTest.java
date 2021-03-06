package ru.job4j.search;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import static org.hamcrest.core.Is.is;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        var persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }

    @Test
    public void whenCanNotFind() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Iosif", "Stalin", "1937", "Moscow")
        );
        var persons = phones.find("Vas");
        assertTrue(persons.isEmpty());
    }
}