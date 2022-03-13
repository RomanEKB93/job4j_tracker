package ru.job4j.inheritance;

public class ResearchTask {
    private String title;

    private String neededSkill;

    public ResearchTask() {

    }

    public ResearchTask(String title, String neededSkill) {
        this.title = title;
        this.neededSkill = neededSkill;
    }

    public String getNeededSkill() {
        return this.neededSkill;
    }

    public String getTitle() {
        return this.title;
    }

}
