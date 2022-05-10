/*
 * Made by: Roger Jayson M. Mendez III
 * Began: 4/26/22
 * Last Modified: 5/10/22
 * Program is designed to receive 4 integer inputs corresponding
 * to how much of a particular coin the user wants there to be.
 * After receiving all inputs, a method will be called to calculate for the
 * total worth of all the coins.
 */
package Exercises.chapterSeven;

import java.util.Scanner;
import java.text.NumberFormat;

public class ExerciseFive {
    /*
     * Will take 4 inputs corresponding to the four
     * coin types. Program will then multiply the amount
     * of coins with their specific weight and add it into
     * the accumulator. The final value is then formatted into
     * Dollar format.
     * pre: none
     * post: String formatted from the double result of
     *       the coin tally
     */
    public static String getDollarAmount(int quarters, int dimes, int nickels, int pennies) {
        Double value = 0.0;
        NumberFormat dollar = NumberFormat.getCurrencyInstance();

        value += (double) quarters * 0.25;
        value += (double) dimes * 0.10;
        value += (double) nickels * 0.05;
        value += (double) pennies * 0.01;

        return dollar.format(value);
    }

    public static void main(String[] args) {
        int quarters, dimes, nickels, pennies;
        String value;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your total coins:");
        System.out.print("Quarters: ");
        quarters = in.nextInt();
        System.out.print("Dimes: ");
        dimes = in.nextInt();
        System.out.print("Nickels: ");
        nickels = in.nextInt();
        System.out.print("Pennies: ");
        pennies = in.nextInt();

        value = getDollarAmount(quarters, dimes, nickels, pennies);

        System.out.println("\nTotal: " + value);

        in.close();
    }
}
