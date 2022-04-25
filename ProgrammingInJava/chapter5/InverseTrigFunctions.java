package ProgrammingInJava.chapter5;

import java.lang.Math;
import java.util.Scanner;
import java.text.DecimalFormat;

    public class InverseTrigFunctions{
        public static void main(String[] args) {
            double  angle;
            double  asin, acos, atan;
            Scanner input = new Scanner(System.in);
            DecimalFormat dec = new DecimalFormat("0.##");

            System.out.println("Enter an angle in degrees: ");
            angle = input.nextInt();
            
            if(angle < 0 || angle > 180){
                System.out.println("Enter a value from 0 to 180");
            } else{

                asin = Math.asin(Math.toRadians(angle));
                acos = Math.acos(Math.toRadians(angle));
                atan = Math.atan(Math.toRadians(angle));
              
                System.out.println("Asin: " + dec.format(asin));
                System.out.println("Acos: " + dec.format(acos));
                System.out.println("Atan: " + dec.format(atan));

                input.close();
            }
        }
    }
