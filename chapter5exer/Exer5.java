/*
Developed by: Mac Kristan B. Isaac
Date: 04/21/2022
*/

package chapter5exer;
import java.util.Scanner;

public class Exer5 {
    public static void main(String[] args) {
       double grade;
       Scanner input = new Scanner(System.in);

       System.out.print("Enter the percentage: ");
       grade = input.nextDouble();
       input.close();

        if(grade>=90 && grade<=100){
            System.out.println("The corresponding letter grade is: A");
        }
        if(grade>=80 && grade<=89){
            System.out.println("The corresponding letter grade is: B");
        }
        if(grade>=70 && grade<=79){
            System.out.println("The corresponding letter grade is: C");
        }
        if(grade>=60 && grade<=69){
            System.out.println("The corresponding letter grade is: D");
        }
        if(grade<60){
            System.out.println("The corresponding letter grade is: F");
        }

    }
}
