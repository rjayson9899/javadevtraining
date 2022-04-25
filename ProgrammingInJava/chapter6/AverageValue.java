package ProgrammingInJava.chapter6;

import java.util.Scanner;

public class AverageValue{

    public static void main(String[] args) {
        final int SENTINEL = 0; //Flag to Stop iterating
        int newInput;
        int numValues = 0; 
        int sumValues = 0; 
        double avg; 

        Scanner input = new Scanner(System.in);
        
        System.out.println("Calculate Average Program");
        System.out.print("Enter a value (" + SENTINEL + " to quit): ");
        newInput = input.nextInt();

        while (newInput != SENTINEL){
            numValues += 1; //Counter
            sumValues += newInput; //Accumulator
            System.out.print("Enter a value (" + SENTINEL + " to quit): ");
            newInput = input.nextInt();
        }
        input.close();

        avg = (double)sumValues / (double)numValues;
        System.out.println("Average is: " + avg);
    }
}