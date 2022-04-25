package ProgrammingInJava.chapter5;

import java.lang.Math;
import java.util.Scanner;
import java.text.DecimalFormat;

public class TrigFunctions{
     public static void main(String[] args) {
        double angle;
        double sin,cos,tan;
        Scanner input = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("0.##");

        System.out.println("Enter an angle in degrees: ");
        angle = input.nextInt();

        if(angle < 0 || angle > 180){
            System.out.println("Enter a value from 0 to 180");
        } else{
            sin = Math.sin (Math.toRadians(angle));
            cos = Math.cos (Math.toRadians(angle));
            tan = Math.tan (Math.toRadians(angle));

            System.out.println("Sin: " + dec.format(sin));
            System.out.println("Cos: " + dec.format(cos));
            System.out.println("Tan: " + dec.format(tan));

            input.close();
        }
    }
}