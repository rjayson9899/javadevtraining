package chapterNineExerciseOne;

import java.util.Scanner;

public class Mains {

    public static void main(String[] args){
        int user;

        Scanner userIn = new Scanner(System.in);

        staff sta = new staff("Ykcam", 100000, "Principal");
        faculty fac = new faculty("Macky", 500000, "Engineering Department");

        System.out.println("Hello Good day!");
        System.out.println("Please enter your choice: ");
        System.out.println("1. Faculty ");
        System.out.println("2. Staff ");

        user = userIn.nextInt();
        switch (user){
            case 1:
            System.out.println("Name: " + fac.getName());
            System.out.println("Salary: " + fac.getSalary());
            System.out.println("Department name: " + fac.getDeptName());
            break;

            case 2:
            System.out.println("Name: " + sta.getName());
            System.out.println("Salary: " + sta.getSalary());
            System.out.println("Job title: " + sta.getJobTitle());
            break;
        }

        userIn.close();
    }
}
