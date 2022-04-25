/*
Developed by: Mac Kristan B. Isaac
Date: 04/21/2022
*/

package chapter5exer;

import java.util.Scanner;

public class Exer4 {
    public static void main(String[] args) {
        int[] defect = {119, 179, 189, 190, 191, 192, 193, 194, 195,221, 780};
        Scanner input = new Scanner(System.in);
        int model;
        boolean checker = true;


        System.out.print("Enter the car's model number: ");
        model = input.nextInt();
        input.close();

        for(int x=0; x<defect.length-1;x++){
            if(model == defect[x]){
                System.out.println("Your car is defective. It must be repaired.");
                checker = false;
                break;
            }
        }

        if(checker == true){
            System.out.println("Your car is not defective.");
        }
    }
}
