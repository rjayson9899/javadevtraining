package ProgrammingInJava.chapter6;

import java.util.Scanner;

public class DigitsSum{
    public static void main(String[] args) {
        int i;
        int store = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        i = input.nextInt();
        input.close();

        String int_string = Integer.toString(i);
        
        for(int x = 0; x < (int_string.length()); x++){
            store += Character.getNumericValue(int_string.charAt(x));
        }
        System.out.println(store);
    }
}