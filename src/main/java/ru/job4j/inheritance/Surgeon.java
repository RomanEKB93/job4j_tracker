package ru.job4j.inheritance;

import javax.swing.text.html.HTMLDocument;

public class Surgeon extends Doctor {
    private String specialization;

    public Surgeon() {
        super();
    }

    public Surgeon(String specialization) {
        super();
        this.specialization = specialization;
    }

    public Surgeon(String name, String surname, String education, String birthday, String category, String specialization) {
        super(name, surname, education, birthday, category);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public Diagnosis heal(Patient patient) {
        if (this.specialization.equals("traumatologist") && "Broken arm".equals(patient.getSymptom())) {
            return new Diagnosis("Arm fracture", "Apply plaster");
        } else {
            return new Diagnosis("Not my specialization", "Please, consult other specialist!");
        }
    }

}

