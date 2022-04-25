package ProgrammingInJava.chapter5;

/*
A program that checks the package requirements
Made by: Edmark Aldea

Chapter 5: Exercise 2
*/

import java.util.Scanner;

public class PackageCheck{
    public static void checkPackage() {
        int weight, length, width, height, total;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter package weight in kilograms: ");
        weight = input.nextInt();
        System.out.println("Enter package length in centimeters: ");
        length = input.nextInt();
        System.out.println("Enter package width in centimeters: ");
        width = input.nextInt();
        System.out.println("Enter package height in centimeters: ");
        height =input.nextInt();
        input.close();

        total = length * width * height;

        if(weight > 27 && total > 100000 ){
            System.out.println("Too heavy and too large.");
        }else if(weight > 27){
            System.out.println("Too heavy.");
        }else if(total > 100000){
            System.out.println("Too large.");
        }
        else{
            System.out.println("Package Accepted.");
        }

    }
    public static void main(String[] args) {
        checkPackage();
    }
}