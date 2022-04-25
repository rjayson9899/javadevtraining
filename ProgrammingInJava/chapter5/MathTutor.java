package ProgrammingInJava.chapter5;

import java.util.Scanner;
import java.util.Random;

public class MathTutor{
    public static void main(String[] args){
        int num1, num2, oper;
        int randgen = 0, ans = 0;  
        Scanner input = new Scanner(System.in);
        Random r1 = new Random();

        num1 = r1.nextInt(10 + 1);
        num2 = r1.nextInt(10 + 1);
        oper = r1.nextInt(3);

        switch(oper){
            case 0: // Addition
                System.out.println("What is " + num1 + "+" + num2);
                ans = input.nextInt();
                randgen = num1 + num2;
                break;
            case 1: // Subtraction
                System.out.println("What is " + num1 + "-" + num2);
                ans = input.nextInt();
                randgen = num1 - num2;
                break;
            case 2: // Multiplication
                System.out.println("What is " + num1 + "*" + num2);
                ans = input.nextInt();
                randgen = num1 * num2;
                break;
            case 3: // Division
                System.out.println("What is " + num1 + "/" + num2);
                ans = input.nextInt();
                randgen = num1 / num2;
                break;
        }
        input.close();

        if (ans == randgen){
            System.out.println("Correct!");
        }else{
            System.out.println("Wrong Answer!");
        }
    }
}