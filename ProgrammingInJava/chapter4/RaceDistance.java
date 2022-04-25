package ProgrammingInJava.chapter4;

import java.util.Scanner;


public class RaceDistance{
    public static void main(String[] args) {
        double first, second, third, total;
        String name;
        Scanner input = new Scanner(System.in);
       // Scanner str = new Scanner(System.in);

        System.out.println("Enter the first distance: ");
        first = input.nextDouble();
        System.out.println("Enter the second distance: ");
        second = input.nextDouble();
        System.out.println("Enter the third distance: ");   
        third = input.nextDouble();
        System.out.println("Enter the runner's name: ");
        name = input.next();
        //name = str.nextLine();
        input.close();
        //str.close();

        total = first + second + third;
        
        System.out.println("Runner's Name is: " + name);
        System.out.println("Total Distance is: " + total);
        

    }
}