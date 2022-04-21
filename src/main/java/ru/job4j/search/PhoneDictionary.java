package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> checkPhone = x -> x.getPhone().contains(key);
        Predicate<Person> checkAddress = x -> x.getAddress().contains(key);
        Predicate<Person> checkName = x -> x.getName().contains(key);
        Predicate<Person> checkSurname = x -> x.getSurname().contains(key);
        Predicate<Person> combine = checkPhone.or(checkAddress).or(checkName).or(checkSurname);
        var result = new ArrayList<Person>();
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
