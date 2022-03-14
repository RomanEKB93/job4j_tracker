package ru.job4j.pojo;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class College {
    public static void main(String[] args) {
        Student geek = new Student();
        geek.setFio("Medgidov Abdula Guseinovich");
        geek.setGroup("E-501");
        Calendar calendar = Calendar.getInstance();
        calendar.set(2020, Calendar.SEPTEMBER, 1);
        geek.setAdmission(calendar.getTime());
        SimpleDateFormat frmt = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println("Student " + geek.getFio() + " from group " + geek.getGroup()
                + " admissed at " + frmt.format(geek.getAdmission()));
    }
}
