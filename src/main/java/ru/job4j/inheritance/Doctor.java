package ru.job4j.inheritance;

public class Doctor extends Profession {
    private String category;

    public Doctor() {
        super();
    }

    public Doctor(String category) {
        super();
        this.category = category;
    }

    public Doctor(String name, String surname, String education, String birthday, String category) {
        super(name, surname, education, birthday);
        this.category = category;
    }

    public String getCategory() {
        return this.category;
    }

    public Diagnosis heal(Patient patient) {
        return new Diagnosis("The case is difficult", "You need to visit a specialist doctor!");
    }

}
