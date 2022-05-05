package ProgrammingInJava.chapter10;

import java.util.Scanner;

public class StudentRoster {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numStudents;

        System.out.print("How many students?: ");
        numStudents = input.nextInt();

        String [] studentName = new String [numStudents];

        for(int x = 0; x < studentName.length; x++){
            System.out.print("Enter student's name: ");
            studentName[x] = input.next(); 
        }
        System.out.println("Student Roster");

        for(int x = 0; x < studentName.length; x++){
            System.out.println(studentName[x]);
        }
        input.close();
    }
}
