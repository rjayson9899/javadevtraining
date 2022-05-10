package ProgrammingInJava.chapter10;

import java.util.Scanner;
import java.util.ArrayList;

public class HighestGrade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<Integer>();
        int highestGrade = -1; 
        int numGrades = 5;

        System.out.print("Enter 5 grades between 0 to 100: ");

        while(grades.size() < 5) {
            
            int input = sc.nextInt();
            if(input <= 100 && input >= 0) {
                grades.add(input);
                if (input >= highestGrade) 
                    highestGrade = input;
                    numGrades--;
                if (numGrades != 0) {
                    System.out.print("Enter " + numGrades + " more grade: ");
                }
            } else {
                System.out.println("Make sure the grade you have entered is between 0 to 100");
                System.out.print("Enter a new Grade: ");
            }
        }
        System.out.println("The highest grade is: " + highestGrade);
        sc.close();
    }
}
