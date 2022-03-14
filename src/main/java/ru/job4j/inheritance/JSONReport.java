package ru.job4j.inheritance;

public class JSONReport extends TextReport {

    public String generate(String name, String body) {
        String nln = System.lineSeparator();
        return "{" + nln + "\t\"name\" : \"" + name + "\"," + nln
                + "\t\"body\" : \"" + body + "\"" + nln + "}";
    }

}
