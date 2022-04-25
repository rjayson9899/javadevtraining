package chapter4exer;

import java.util.Scanner;

public class exer1 {
    public static void main(String[] args) {
        double height = 0, total = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a time less than 4.5 seconds: ");
        height = input.nextDouble();

        if(height <= 4.5){
            total = 100-(4.9* height *2);
            System.out.println("The height of the object is: " + total + " meters");
        }

        else{
            System.out.println("wrong input");
        }

        input.close();

    }
}
