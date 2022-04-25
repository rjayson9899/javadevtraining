package ProgrammingInJava.chapter5;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbers{
    public static void main(String[] args) {
        int max,min, display;
        Scanner input = new Scanner(System.in);
        Random r1 = new Random();

        System.out.println("Enter the minimum value: ");
        min = input.nextInt();
        System.out.println("Enter the maximum value: ");
        max = input.nextInt();
        input.close();

        display = r1.nextInt(max - min + 1) + min;
        System.out.println("The random number generated is: " + display);

    }
}