package ru.job4j.inheritance;

public class Engineer extends Profession {
    private String[] skills;

    public Engineer() {
        super();
    }

    public Engineer(String[] skills) {
        super();
        this.skills = skills;
    }

    public Engineer(String name, String surname, String education, String birthday, String[] skills) {
        super(name, surname, education, birthday);
        this.skills = skills;
    }

    public String[] getSkills() {
        return this.skills;
    }

    public String solveTheTask(ResearchTask task) {
        if (task.getTitle() == null || task.getTitle().isEmpty()) {
            return new String("Please, set me the task.");
        } else {
            for (String skill : this.skills) {
                if (skill.equals(task.getNeededSkill())) {
                    return new String("The task " + task.getTitle() + " will be executed!");
                }
            }
            return new String("I have no enough skills to execute the task.");
        }
    }

}
