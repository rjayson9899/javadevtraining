/*
Developed by: Mac Kristan B. Isaac
Date: 04/21/2022
*/

package chapter5exer;
import java.util.Scanner;


public class Exer3 {
   public static void main(String[] args) {
       int numEggs = 0;
       int numDozen;
       int numExtra;
       double price;
       Scanner input = new Scanner(System.in);

       System.out.print("Enter the number of eggs purchased: ");
       numEggs = input.nextInt();
       input.close();
       
       numDozen = numEggs/12;
       numExtra = numEggs%12;

       if(numDozen >= 0 && numDozen < 4){
           price = numDozen * 0.50;
           price = price + (numExtra*(0.50/12));
           System.out.println("The bill is equal to: $" + price);
       }

       else if(numDozen >=4 && numDozen < 6){
        price = numDozen * 0.45;
        price = price + (numExtra*(0.45/12));
        System.out.println("The bill is equal to: $" + price);
       }

       else if(numDozen >=6 && numDozen < 11){
        price = numDozen * 0.40;
        price = price + (numExtra*(0.40/12));
        System.out.println("The bill is equal to: $" + price);
       }

       else if(numDozen >= 11){
        price = numDozen * 0.35;
        price = price + (numExtra*(0.35/12));
        System.out.println("The bill is equal to: $" + price);
       }




   } 
}
