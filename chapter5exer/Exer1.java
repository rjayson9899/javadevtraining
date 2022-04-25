

/*
Developed by: Mac Kristan B. Isaac
Date: 04/21/2022
*/

package chapter5exer;
import java.util.Scanner;

public class Exer1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int copies=0;
        double price;

        System.out.print("Enter the number of copies to be printed: ");
        copies = input.nextInt();
        input.close();

        if(copies>=0&&copies<=99){
            System.out.println("Price per copy is: $0.30 per copy");
            price = copies*0.30;
            System.out.println("Total cost is: $" + price);
        }

        else if(copies>=100 && copies<=499){
            System.out.println("Price per copy is: $0.28 per copy");
            price = copies*0.28;
            System.out.println("Total cost is: $" + price);
        }

        else if(copies>=500 && copies<=749){
            System.out.println("Price per copy is: $0.27 per copy");
            price = copies*0.27;
            System.out.println("Total cost is: $" + price);
        }

        else if(copies>=750 && copies<=1000){
            System.out.println("Price per copy is: $0.26 per copy");
            price = copies*0.26;
            System.out.println("Total cost is: $" + price);
        }

        else if(copies>=1000){
            System.out.println("Price per copy is: $0.25 per copy");
            price = copies*0.25;
            System.out.println("Total cost is: $" + price);
        }

        else{
            System.out.println("wrong input");
        }

    }
    

}
