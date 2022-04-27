package ProgrammingInJava.chapter7;

import java.util.Scanner;

public class TempConverter { 
    public static void fahrenheitToCelsius() {
        double fTemp, cTemp;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Temperature in Fahrenheit: ");
        fTemp = input.nextDouble();
        input.close();

        cTemp = ((double)5) / ((double)9 * fTemp - 32);
        System.out.print("The Celsius Temperature is: " + cTemp);
    }

    public static void celsiusToFahrenheit() {
        double cTemp, fTemp;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Temperature in Celsius: ");
        cTemp = input.nextDouble();
        input.close();

        fTemp = (double)9 / (double)5 * cTemp + 32;
        System.out.println("The Fahrenheit Temperature is: " + fTemp);
    }

    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);

        System.out.println("1. Fahrenheit to Celsius conversion.");
        System.out.println("2. Celsius to Fahrenheit conversion.");
        System.out.print("Enter your choice: ");
        choice = input.nextInt();
        if (choice == 1) {
            fahrenheitToCelsius();
        } else {
            celsiusToFahrenheit();
        }
        input.close();
    }
}
