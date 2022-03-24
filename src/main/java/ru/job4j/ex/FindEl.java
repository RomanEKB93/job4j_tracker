package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (key.equals(value[i])) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("String array \"value\" does not contain string \"key\"");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] value = {"Pork", "Chicken", "Fish",
                          "Vegetables", "Potatoes", "Mushrooms"
        };
        try {
            int good = FindEl.indexOf(value, "Potatoes");
            int bad = FindEl.indexOf(value, "Hello");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
