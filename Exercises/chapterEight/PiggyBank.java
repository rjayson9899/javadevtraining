package Exercises.chapterEight;

import java.text.NumberFormat;

public class PiggyBank {
    private int nickels;
    private int pennies;
    private int dimes;
    private int quarters;

    public PiggyBank() {
        this.nickels = 0;
        this.pennies = 0;
        this.dimes = 0;
        this.quarters = 0;
    }

    private String getDollarAmount() {
        Double value = 0.0;
        NumberFormat dollar = NumberFormat.getCurrencyInstance();

        value += (double) this.quarters * 0.25;
        value += (double) this.dimes * 0.10;
        value += (double) this.nickels * 0.05;
        value += (double) this.pennies * 0.01;

        return dollar.format(value);
    }

    public void showTotal() {
        System.out.println("Pennies: " + this.pennies);
        System.out.println("Nickels: " + this.nickels);
        System.out.println("Dimes: " + this.dimes);
        System.out.println("Quarters: " + this.quarters);
    }

    public void addNickel() {
        this.nickels++;
    }

    public void addDime() {
        this.dimes++;
    }

    public void addPenny() {
        this.pennies++;
    }

    public void addQuarter() {
        this.quarters++;
    }

    public void emptyBank() {
        System.out.println(this.pennies + " penny(ies), " + this.nickels + " nickel(s), " + this.dimes + 
            " dime(s), and " + this.quarters + " quarter(s) removed from bank for a total of: " + getDollarAmount());
        
        this.nickels = 0;
        this.pennies = 0;
        this.dimes = 0;
        this.quarters = 0;
    }
}
