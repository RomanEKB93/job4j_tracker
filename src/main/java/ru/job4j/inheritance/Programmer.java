package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private String language;

    public Programmer() {
        super();
    }

    public Programmer(String language) {
        super();
        this.language = language;
    }

    public Programmer(String name, String surname, String education, String birthday, String[] skills, String language) {
        super(name, surname, education, birthday, skills);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public String fixTheBug(Error error) {
        if (error.getStatus() < 10) {
            return new String("Okay, I can fix it!");
        } else {
            return  new String("Sorry, the error is unknown, ask someone else!");
        }
    }

}
