package chapter8exer3;

import java.util.Scanner;
import java.text.NumberFormat;
public class LunchOrder {
    public static void main(String[] args) {
        
        //initializations
        Scanner input = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        int numHam = 0, numSal = 0, numFries = 0, numSoda = 0;
        double total = 0;
        Food hamburger = new Food(1.85, 9, 33,1);
        Food salad = new Food(2, 1, 11, 5);
        Food fries = new Food(1.30, 11, 36, 4);
        Food soda = new Food(0.95, 0, 38, 0);
        Food[] menu = {hamburger , salad, fries, soda};
        String[] menuName = {"hamburger", "salad" , "fries", "soda"};
        int[] inputArray = {numHam, numSal, numFries, numSoda};

       //output 
       for(int x = 0; x < menu.length; x++){     
           System.out.print("Enter number of " + menuName[x] + ": ");
           inputArray[x] = input.nextInt();
           System.out.println("Each " + menuName[x] + " has " + menu[x].getFat() + "g of fat, " 
                                + menu[x].getCarbs() + "g of carbs, and " + menu[x].getFiber() + "g of fiber\n");
           total += menu[x].getPrice() * inputArray[x];
       }

       System.out.println("Your order comes to: " + money.format(total));
       input.close();
    }
}
