/*
Developed by: Mac Kristan B. Isaac
Date: 04/21/2022
*/

package chapter5exer;
import java.util.Scanner;

public class Exer2 {
    public static void main(String[] args) {
        double kilogram = 0;
        double length = 0;
        double width = 0;
        double height = 0;
        double cubic = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter package weight in kilograms: ");
        kilogram = input.nextDouble();
        System.out.print("Enter package length in centimeters: ");
        length = input.nextDouble();
        System.out.print("Enter package width in centimeters: ");
        width = input.nextDouble();
        System.out.print("Enter package height in centimeters: ");
        height = input.nextDouble();

        input.close();
        
        cubic = length * width * height;
        
        if(kilogram >= 27 && cubic <= 100000){
            System.out.println("Too heavy.");
        }
        else if(kilogram <= 27 && cubic >= 100000){
            System.out.println("Too large.");
        }
        else if(kilogram >= 27 && cubic >= 100000){
            System.out.println("Too heavy and too large.");
        }


    }
}
