package ProgrammingInJava.chapter6;

import java.util.Scanner;

public class Prompter{
    public static void main(String[] args) {
        int min, max;
        int n = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the minimum value: ");
        min = input.nextInt();
        System.out.print("Enter the maximum value: ");
        max = input.nextInt();

        do{
            System.out.print("Enter a value ranging from the min value and max value: ");
            n = input.nextInt();
        } while ( n < min || n > max);
        input.close();
    }
}