package ru.job4j.inheritance;

public class Diagnosis {
    private String name;

    private String treatment;

    public Diagnosis() {

    }

    public Diagnosis(String name, String treatment) {
        this.name = name;
        this.treatment = treatment;
    }

    public String getName() {
        return this.name;
    }

    public String getTreatment() {
        return this.treatment;
    }

}
