package ProgrammingInJava.chapter4;

import java.util.Scanner;

public class Digits{
    public static void main(String[] args) {
        int num1, ones, tens;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a 2 digit number: ");
        num1 = input.nextInt();
        input.close();

        ones = num1 % 10;
        tens = (num1 - ones) / 10;

        System.out.println("The Tens-place Digit is: " + tens);
        System.out.println("The Ones-place Digit is: " + ones);


    }
}