package ProgrammingInJava.chapter7;

import java.util.Scanner;
import java.text.NumberFormat;

public class AddCoins {
    public static String getDollarAmount(int pennies, int nickels, int dimes, int quarters){
        double totalValue;
        NumberFormat money = NumberFormat.getCurrencyInstance();

        totalValue = ((double)pennies * 0.01) + ((double)nickels * 0.05) + ((double)dimes * 0.10) + ((double)quarters * 0.25);
        return(money.format(totalValue));
    }

    public static void main(String[] args) {
        int getPennies, getNickels, getDimes, getQuarters;
        String totalValue;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your total coins: \n");
        System.out.print("Quarters: ");
        getQuarters = sc.nextInt();
        System.out.print("Dimes: ");
        getNickels = sc.nextInt();
        System.out.print("Nickels: ");
        getDimes = sc.nextInt();
        System.out.print("Pennies: ");
        getPennies = sc.nextInt();
        sc.close();

        totalValue = getDollarAmount(getPennies, getNickels, getDimes, getQuarters);

        System.out.println("Total is: " + totalValue);

    }
}