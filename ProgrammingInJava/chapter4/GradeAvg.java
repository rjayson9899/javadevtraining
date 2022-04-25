package ProgrammingInJava.chapter4;

import java.util.Scanner;
import java.text.NumberFormat;

public class GradeAvg{

    public static void exerciseGradeAvg(){
        int num1,num2,num3,num4,num5;
        double total, average;
        NumberFormat res1 = NumberFormat.getPercentInstance();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the First Mark: ");
        num1 = input.nextInt();
        System.out.println("Enter the Second Mark: ");
        num2 = input.nextInt();
        System.out.println("Enter the Third Mark: ");
        num3 = input.nextInt();
        System.out.println("Enter the Fourth Mark: ");
        num4 = input.nextInt();
        System.out.println("Enter the Fifth Mark: ");
        num5 = input.nextInt();
        input.close();

        total = ( num1 + num2 + num3 + num4 + num5 ) / 5;
        average = total / 100;
        System.out.println("Your average is: " + (res1.format(average)));

    }
    public static void main(String[] args) {
        exerciseGradeAvg();
    }

}