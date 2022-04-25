package ProgrammingInJava.chapter5;

import java.util.Scanner;

public class Delivery{
    public static void main(String[] args) {
        int length, width, height;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length");
        length = input.nextInt();
        System.out.println("Enter the width");
        width = input.nextInt();
        System.out.println("Enter the height");
        height = input.nextInt();
        input.close();

        if (length > 10 || width > 10 || height > 10){
            System.out.println("Reject");
        }else if (length <= 10 || width <= 10 || height <= 10){
            System.out.println("Accept");
        }
        
    }
}