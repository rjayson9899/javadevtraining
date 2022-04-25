/*
* Made by: Roger Jayson M. Mendez III
* 4/20/22
* This program contains my answers to the exercises located in
* Chapter 4 of the Java programming guide
*/

package chapterFour;

import java.util.Scanner;
import java.text.NumberFormat;

public class Excercises {

    // 3 digit places identifier
    // This program will identify the digit places of 
    // a three digit input
    public static void runExerciseSeven (Scanner in) {
        System.out.print("Input Three Digit Number: ");
        int num = in.nextInt();
        
        if (num < -999 || num > 999) {
            System.out.println("Invalid input");
            return;
        } 

        int ones, tens, hund;
        ones = Math.abs(num%10);
        tens = Math.abs(((num%100) - ones) / 10);
        hund = Math.abs((num - ((tens * 10) + ones))/100);

        System.out.println("Hundreds place is: " + hund);
        System.out.println("Tens place is: " + tens);
        System.out.println("Ones place is: " + ones);
        
    }

    // Program to convert time
    // User will input time in minutes and the program will
    // convert it to hours and minutes format 
    public static void runExerciseNine (Scanner in) {
        System.out.print("Input minutes: ");
        int min_in = in.nextInt();
        
        int hour, min_out;
        hour = min_in / 60;
        min_out = min_in % 60;
        System.out.format("The time is: %d:%02d", hour, min_out);
    } 

    // Program to identify expenditure percents
    // This program requires 4 inputs from user regarding their
    // expenses in 4 specific fields. The program will then
    // output the percent weights of each category
    public static void runExcerciseThirteen (Scanner in) {
        System.out.println("Enter amount spent last month on the following:");
        System.out.print("Food: $");
        double food = in.nextDouble();
        System.out.print("Clothing: $");
        double cloth = in.nextDouble();
        System.out.print("Entertainment: $");
        double ent = in.nextDouble();
        System.out.print("Rent: $");
        double rent = in.nextDouble();

        double sum = food + cloth + ent + rent;

        NumberFormat percent = NumberFormat.getPercentInstance();
        percent.setMinimumFractionDigits(2);

        System.out.println("Category\tPercent");
        System.out.println("Food         \t" + percent.format(food/sum));
        System.out.println("Clothing     \t" + percent.format(cloth/sum));
        System.out.println("Entertainment\t" + percent.format(ent/sum));
        System.out.println("Rent         \t" + percent.format(rent/sum));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1. Exercise 7");
        System.out.println("2. Exercise 9");
        System.out.println("3. Exercise 13");
        System.out.print("Input exercise to run: ");
        int sel = in.nextInt();
        switch (sel) {
            case 1:
                runExerciseSeven(in);
                break;
            case 2:
                runExerciseNine(in);
                break;
            case 3:
                runExcerciseThirteen(in);
                break;
            default:
                System.out.println("Invalid Input");
        }
        
        in.close();
    }
}