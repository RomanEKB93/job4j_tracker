package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private boolean isProsthetist;

    public Dentist() {

    }

    public Dentist(boolean isProsthetist) {
        this.isProsthetist = isProsthetist;
    }

    public Dentist(String name, String surname, String education, String birthday, String category, boolean isProsthetist) {
        super(name, surname, education, birthday, category);
        this.isProsthetist = isProsthetist;
    }

    public boolean isProsthetist() {
        return isProsthetist;
    }

    public String insertTooth() {
        return this.isProsthetist ? new String("Okay, I can do it!") : new String("Sorry, I'm not a protesist");
    }

}
