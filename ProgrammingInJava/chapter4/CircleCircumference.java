package ProgrammingInJava.chapter4;

import java.util.Scanner;

// A program that computes the Circumference of the Circle

public class CircleCircumference{

    public static void main(String[] args) {
        final double PI = 3.14;
        double radius, area;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        radius = input.nextDouble();
        input.close();

        if (radius < 0){
            System.out.println("Negative radii are illegal.");
        } else{
            area = 2 * PI * radius;
            System.out.println("Circumference of the Circle is: " + area);  
        }
    }
}