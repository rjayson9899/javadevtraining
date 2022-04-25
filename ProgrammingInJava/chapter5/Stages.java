package ProgrammingInJava.chapter5;

// A program that prompts the user for an age

import java.util.Scanner;

public class Stages{
    public static void askAge() {
        int age;
        Scanner input = new Scanner(System.in);
    
        System.out.println("Enter an age: ");
        age = input.nextInt();
        input.close();

        if(age > 18){
        System.out.println("Adult");
        }else{
            if (age <= 5){
                System.out.println("Toddler");
            }else{
                if(age <= 10){
                    System.out.println("Child");
                }else{
                    if(age <= 12){
                        System.out.println("Preteen");
                    }else{
                        if(age > 12){
                            System.out.println("Teen");
                        }
                    }
                }
            }
        }
    } 

    public static void main(String[] args) {
        askAge();
    }
}
