package Exercises.chapterSeven;

import java.util.Scanner;
import java.text.NumberFormat;

public class ExerciseFive {
    public static String getDollarAmount(int Q, int D, int N, int P) {
        Double value = 0.0;
        NumberFormat dollar = NumberFormat.getCurrencyInstance();

        value += (double) Q * 0.25;
        value += (double) D * 0.10;
        value += (double) N * 0.05;
        value += (double) P * 0.01;

        return dollar.format(value);
    }

    public static void main(String[] args) {
        int P, N, D, Q;
        String value;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your total coins:");
        System.out.print("Quarters: ");
        Q = in.nextInt();
        System.out.print("Dimes: ");
        D = in.nextInt();
        System.out.print("Nickels: ");
        N = in.nextInt();
        System.out.print("Pennies: ");
        P = in.nextInt();

        value = getDollarAmount(Q, D, N, P);

        System.out.println("\nTotal: " + value);

        in.close();
    }
}
