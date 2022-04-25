/*
* Made by: Roger Jayson M. Mendez III
* On: 4/22/22
* This file contains my answers for the exercises
* found in Chapter 5 of the Java Programming Guide
*/

package chapterFive;

import java.util.Scanner;
import java.util.Random;

public class Exercises {
    
    // Egg Price Quantifier
    // Returns a price based on the amount of eggs inputted.
    // Depending on how many dozens can be derived from the input
    // the price will vary. Excess eggs that cannot form a dozen 
    // are priced 1/12 of the batch price
    public static void runExerciseThree(Scanner in) {
        int eggs, dozen;
        double price, cost;
        
        System.out.print("Enter the amount of eggs to purchase: ");
        eggs = in.nextInt();

        dozen = eggs/12;
        eggs %= 12;

        if (dozen >= 11) price = 0.35;
        else if (dozen >= 6) price = 0.40;
        else if (dozen >= 4) price = 0.45;
        else if (dozen >= 0) price = 0.50;
        else {
            System.out.println("Invalid Value");
            return;
        }
        
        cost = ((double)dozen * price);
        if (eggs > 0) cost += (eggs * (price / 12));

        System.out.format("Total bill: $%.2f", cost);

    }

    // Random Number Quiz
    // Program will generate two numbers between 1 to 10.
    // The user is then tasked to solve for the sum, difference, product, or quotient of the
    // values depending on the randomized operand. If correct, will output "correct." Otherwise,
    // it will output "Wrong"
    public static void runExerciseSix (Scanner in) {
        Random rand = new Random();
        int a, b;
        int op;
        double get;
        double res = 0;
        char op_symbol = 'a';

        a = rand.nextInt(10) + 1;
        b = rand.nextInt(10) + 1;
        op = rand.nextInt(4);

        do {
            op = rand.nextInt(4);
        } while (op != 3);

        switch(op) {
            case 0:
                op_symbol = '+';
                res = a + b;
                break;
            case 1:
                op_symbol = '-';
                res = a - b;
                break;
            case 2:
                op_symbol = '*';
                res = a * b;
                break;
            case 3:
                op_symbol = '/';
                res = (double) a / (double) b;
                res = (double) Math.round(res*100) / 100;
                break;
            
        }

        System.out.print("What is " + a + " " + op_symbol + " " + b + "? ");
        get = in.nextDouble();

        if (get == res) System.out.println("Correct!");
        else System.out.println("Wrong!");
    }

    // Manual Random Number Generator
    // The program makes use of the Linear Congruential Method
    // to generate random numbers. To solve for the values, 4 constants are
    // used which are seed, a, c, and m. To create a different set of pseudorandom
    // patterns, these values can be modified.
    public static void runExerciseEight () {
        final int seed = 12;
        final int a = 1246;
        final int c = 200;
        final int m = 50;
        int xn;
        int xold = 0;

        System.out.format("seed = %d, a = %d, c = %d, m = %d\n\n", seed, a, c, m);

        for (int i = 0; i<9; i++) {
            if (i == 0) xn = ((a*seed) + c) % 50;
            else xn = ((a*xold) + c) % 50;
            System.out.println("(" + a + "*" + xold + " + " + c + ") % " + m + "=" +xn);
            xold = xn;
        }

    }

    // Guessing Game
    // The program will generate a random number between 1 - 20
    // The user is then asked for a numeric input and if the input
    // matches the randomly generated number, they win
    public static void runExerciseNine (Scanner in) {
        Random rand = new Random();
        int comp, user;

        comp = rand.nextInt(19) + 1;
        System.out.print("Enter a number between 1 -20: ");
        user = in.nextInt();

        System.out.println("Computer's Number: " + comp);
        System.out.println("Player's number: " + user);

        if (comp == user) System.out.println("Congrats");
        else System.out.println("Lose");
    }

    // Quadratic Equation Root Solver
    // This program is designed to solve for the roots of a 
    // Quadratic equation provided with the values of a, b, and c.
    // The program is capable identifying if there are roots
    // and solve for it whether real or imaginary
    public static void runExerciseEleven (Scanner in) {
        double a, b, c;
        double root_one, root_two;
        double root_base, irootcomp;
        double before_sqrt;
        String irootstring_one, irootstring_two;

        System.out.print("Enter value for a: ");
        a = in.nextDouble();
        System.out.print("Enter value for b: ");
        b = in.nextDouble();
        System.out.print("Enter value for c: ");
        c = in.nextDouble();

        before_sqrt = Math.pow(b, 2) - (4*a*c);

        if (a == 0) {
            System.out.println("No roots");
            return;
        }
        else if (before_sqrt < 0) {
            irootcomp = Math.sqrt(Math.abs(before_sqrt))/(2*a);
            root_base = -b / (2*a);
            irootstring_one = root_base + " + " + irootcomp + "i";
            irootstring_two = root_base + " - " + irootcomp + "i";
            System.out.println("The roots are " + irootstring_one + " and " + irootstring_two);
        }
        else {
            root_one = (-b + Math.sqrt(before_sqrt))/(2*a);
            root_two = (-b - Math.sqrt(before_sqrt))/(2*a);
            System.out.println("The roots are " + root_one + " and " + root_two);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sel;
        System.out.println("1. Exercise 3");
        System.out.println("2. Exercise 6");
        System.out.println("3. Exercise 8");
        System.out.println("4. Exercise 9");
        System.out.println("5. Exercise 11");
        System.out.print("Input which exercise to run: ");
        sel = in.nextInt();
        switch (sel) {
            case 1:
                runExerciseThree(in);
                break;
            case 2:
                runExerciseSix(in);
                break;
            case 3:
                runExerciseEight();
                break;
            case 4:
                runExerciseNine(in);
                break;
            case 5:
                runExerciseEleven(in);
                break;
            default:
                System.out.println("Invalid Input!");
        }
        in.close();
    }
}
