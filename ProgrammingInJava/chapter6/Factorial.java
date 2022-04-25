package ProgrammingInJava.chapter6;

import java.util.Scanner;

public class Factorial{

    public static void usingFactorials() {
        int i, num;
        int fac = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = input.nextInt();
        input.close();
        
        if(num < 0){
            System.out.print("Enter an integer greater than 0: ");
        }else{
            for (i = 1; i <= num; i++) {
                fac = fac*i;
            }
            System.out.println("Factorial of " + num + " is = " + fac);
        }
    }

    public static void usingOddSum(){
        int i, num;
        int sum = 0; 
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = input.nextInt();
        input.close();

        for(i = 1; i <= num; i+=2){
            sum += i;
        }

        System.out.print("The sum of all odd numbers are: " + sum);
    }

    public static void main(String[] args) {
        usingOddSum();
    }
}