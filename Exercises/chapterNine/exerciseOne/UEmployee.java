package Exercises.chapterNine.exerciseOne;

import java.text.NumberFormat;

public class UEmployee {
    private String name;
    private double salary;

    public UEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getSalary() {
        NumberFormat money = NumberFormat.getCurrencyInstance();
        return money.format(this.salary);
    }
}
