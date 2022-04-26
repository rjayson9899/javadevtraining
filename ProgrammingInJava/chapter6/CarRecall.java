package ProgrammingInJava.chapter6;

import java.util.Scanner;

public class CarRecall{
    public static void checkModel() {
        final int SENTINEL = 0; 
        int model = 1;
        Scanner input = new Scanner(System.in);
        
        while(model != SENTINEL){
            System.out.print("Enter the car's model number (" + SENTINEL + " to quit): ");
            model = input.nextInt();
            switch (model){
                case 0:
                    break;
                case 119: 
                case 179:
                case 189:
                case 190:
                case 191:
                case 192:
                case 193:
                case 194:
                case 195:
                case 221:
                case 780:
                    System.out.println("Your car is defective. It must be repaired.");
                    break;
    
                default:
                    System.out.println("Your car is in good condition. No need for repairs.");
                    break;
            }
        }
        input.close();
    }
    
    public static void main(String[] args) {
        checkModel();    
    }
}

