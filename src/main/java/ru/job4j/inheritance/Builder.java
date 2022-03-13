package ru.job4j.inheritance;

public class Builder extends Engineer {

    private String inventory;

    public Builder() {
        super();
    }

    public Builder(String inventory) {
        super();
        this.inventory = inventory;
    }

    public Builder(String name, String surname, String education, String birthday, String[] skills, String inventory) {
        super(name, surname, education, birthday, skills);
        this.inventory = inventory;
    }

    public String getInventory() {
        return inventory;
    }

    public String getWorkCost(String workType) {
        String rsl = switch (workType) {
            case "Laying tiles" -> "Cost is 10 dollars per square meter.";
            case "Wall construction" -> "Cost is 20 dollars per meter of height.";
            default -> "Unknown operation.";
        };
        return rsl;
    }
}
