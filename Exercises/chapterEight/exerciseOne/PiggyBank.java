/*
 * Made by: Roger Jayson M. Mendez III
 * Began: 4/26/22
 * Last Modified: 5/10/22
 * This exercise provides the oppurtunity to apply the basics of OOP in Java. In this exercise, 
 * the programmer is tasked to design a class that represents a piggy bank. This class file represents
 * the piggy bank object to be implemented. This object is expected to have methods to increment 
 * nickels, pennies, dimes, and quarters by 1 for each call. The option to check the current amount of 
 * coins in the bank must also be available. Finally, a method for cashing out all the  coins in the 
 * piggy bank must be implemented. To achieve this, 4 key characteristics were isolated which are the 4
 * different coins. The decision to only factor in these 4 characteristics is mainly due to all methods
 * being focused solely on the coins.
 */
package Exercises.chapterEight.exerciseOne;

import java.text.NumberFormat;

public class PiggyBank {
    private int nickels;
    private int pennies;
    private int dimes;
    private int quarters;

    /*
     * Instantiate a piggy bank object with
     * 0 initial coins
     * pre: none
     * post: Piggy bank object instantiated with 0 coins.
     */
    public PiggyBank() {
        this.nickels = 0;
        this.pennies = 0;
        this.dimes = 0;
        this.quarters = 0;
    }

    /*
     * Returns the total tally of coins
     * in dollars.
     * pre: none
     * post: String of double resultant formated to dollar
     */
    private String getDollarAmount() {
        Double value = 0.0;
        NumberFormat dollar = NumberFormat.getCurrencyInstance();

        value += (double) this.quarters * 0.25;
        value += (double) this.dimes * 0.10;
        value += (double) this.nickels * 0.05;
        value += (double) this.pennies * 0.01;

        return dollar.format(value);
    }

    /*
     * Shows how much of each type of
     * coin is stored in the bank
     * pre: none
     * post: Quantity of each coin
     *       output in terminal
     */
    public void showTotal() {
        System.out.println("Pennies: " + this.pennies);
        System.out.println("Nickels: " + this.nickels);
        System.out.println("Dimes: " + this.dimes);
        System.out.println("Quarters: " + this.quarters);
    }

    /*
     * Adds one nickel to piggy bank
     * pre: none
     * post: Nickel variable incremented by 1
     */
    public void addNickel() {
        this.nickels++;
    }

    /*
     * Adds one dime to piggy bank
     * pre: none
     * post: Dimes variable increments by 1
     */
    public void addDime() {
        this.dimes++;
    }

    /*
     * Adds one penny to piggy bank
     * pre: none
     * post: Pennies variable incremented by 1
     */
    public void addPenny() {
        this.pennies++;
    }

    /*
     * Adds one quarter to piggy bank
     * pre: none
     * post: Quarters variable incremented by 1
     */
    public void addQuarter() {
        this.quarters++;
    }

    /*
     * Provides breakdown of each coin amount, outputs total value of 
     * coins in piggy bank, and resets all coin values to zero.
     * pre: none
     * post: Coin quantity and total value output to terminal
     *       nickels, dimes, pennies, and quarters value reset to 0
     */
    public void emptyBank() {
        System.out.println(this.pennies + " penny(ies), " + this.nickels + " nickel(s), " + this.dimes + 
            " dime(s), and " + this.quarters + " quarter(s) removed from bank for a total of: " + getDollarAmount());
        
        this.nickels = 0;
        this.pennies = 0;
        this.dimes = 0;
        this.quarters = 0;
    }
}
