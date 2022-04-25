package ProgrammingInJava.chapter4;

import java.util.Scanner;

public class practiceDigits{

    public static void exerciseDigits() {
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

    public static void exerciseCasting(){
        int i = 2;
        double d = 3.7;
        int x;

        x = i * (int)d;
        System.out.println(x);
    }

    public static void main(String[] args) {
        exerciseCasting();
    }
}