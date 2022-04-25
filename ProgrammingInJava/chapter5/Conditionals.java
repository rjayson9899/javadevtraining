package ProgrammingInJava.chapter5;

import java.util.Scanner;

public class Conditionals{

    public static void main(String[] args) {
        int height;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the wave height: ");
        height = input.nextInt();
        input.close();

        if (height >= 6 ) {
            System.out.println("Great Day for Surfing!");
        } else if (3 <= height){
            System.out.println("Go body boarding!");
        } else if (height < 3){
            System.out.println("Whoa! What kind of surf is that?");
        }
        } 

    }
