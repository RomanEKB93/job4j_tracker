package ru.job4j.inheritance;

public class Patient {

    private String name;

    private String surname;

    private String symptom;

    public Patient() {

    }

    public Patient(String name, String surname, String symptom) {
        this.name = name;
        this.surname = surname;
        this.symptom = symptom;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSymptom() {
        return this.symptom;
    }

}
