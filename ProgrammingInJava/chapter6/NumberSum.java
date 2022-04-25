package ProgrammingInJava.chapter6;

import java.util.Scanner;   

public class NumberSum{
    public static void main(String[] args) {
        int numInput = 1;
        int sum = 0;
        Scanner input = new Scanner(System.in);

        while(numInput > 0){
            System.out.print("Enter a number: ");
            numInput = input.nextInt();
            sum += numInput;
            System.out.println("Sum is: " + sum);
        }
        input.close();
    }
}