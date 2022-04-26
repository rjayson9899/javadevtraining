package ProgrammingInJava.chapter6;

import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[] args) {
        int num1;
        boolean isPrime;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num1 = input.nextInt();
        input.close();

        isPrime = true;

        for (int i = 2; i < num1 / 2; i++) {
            if(num1 % i == 0){
                isPrime = false;
            }
        }
        
        if(isPrime){
            System.out.print(num1 + " is a prime number.");
        }else{
            System.out.print(num1 + " is not a prime number.");
        }
    }
}
