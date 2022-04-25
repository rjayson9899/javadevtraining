package chapter6exer;

import java.util.Scanner;

public class exer1 {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        boolean tip1 = true , tip2 = true;
        int num1 = 0, num2 = 0;

        System.out.print("Input the first number: ");
        num1 = input.nextInt();

        for(int x = 2; x <= num1 / 2; x++){
            if(num1 % x == 0){
                tip1 = false;
                break;
            }

        }


        System.out.print("Input the second number: ");
        num2 = input.nextInt();
        
        for(int x = 2; x <= num2 / 2; x++){
            if(num2 % x == 0){
                tip2 = false;
                break;
            }

        }

        if(tip1 == true && !tip2){
            System.out.println("The first number is a prime number.");
        }

        else if(!tip1 && tip2 == true){
            System.out.println("The second number is a prime number.");
        }

        else if(tip1 == true && tip2 == true){
            System.out.println("Both numbers are prime numbers.");
        }

        else{
            System.out.println("Both numbers are not prime numbers.");
        }

        input.close();
    }
}
