package Exercises.chapterEight;

import java.text.NumberFormat;

public class PiggyBank {
    private int nickels;
    private int pennies;
    private int dimes;
    private int quarters;

    public PiggyBank() {
        nickels = 0;
        pennies = 0;
        dimes = 0;
        quarters = 0;
    }

    private String getDollarAmount() {
        Double value = 0.0;
        NumberFormat dollar = NumberFormat.getCurrencyInstance();

        value += (double) quarters * 0.25;
        value += (double) dimes * 0.10;
        value += (double) nickels * 0.05;
        value += (double) pennies * 0.01;

        return dollar.format(value);
    }

    public void showTotal() {
        System.out.println("Pennies: " + pennies);
        System.out.println("Nickels: " + nickels);
        System.out.println("Dimes: " + dimes);
        System.out.println("Quarters: " + quarters);
    }

    public void addNickel() {
        nickels++;
    }

    public void addDime() {
        dimes++;
    }

    public void addPenny() {
        pennies++;
    }

    public void addQuarter() {
        quarters++;
    }

    public void emptyBank() {
        System.out.println(pennies + " penny(ies), " + nickels + " nickel(s), " + dimes + " dime(s), and " +
            quarters + " quarter(s) removed from bank for a total of: " + getDollarAmount());
        
        nickels = 0;
        pennies = 0;
        dimes = 0;
        quarters = 0;
    }
}
