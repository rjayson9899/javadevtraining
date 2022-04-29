package ProgrammingInJava.chapter8;

import java.util.Scanner;
import java.text.NumberFormat;

public class LunchOrder{
    
    public static void main(String[] args) {
        Food hamburger = new Food(1.85, 9.0, 33.0, 1.0);
        Food salad = new Food(2.00, 1.0, 11.0, 5.0);
        Food frenchfries = new Food(1.30, 11.0, 36.0, 4.0);
        Food soda = new Food(0.95, 0.0, 38.0, 0.0);
        Scanner sc = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();

        int menuHamburger, menuSalad, menuFrenchfries, menuSoda;
        double totalPrice;

        System.out.print("Enter number of hamburgers: ");
        menuHamburger =  sc.nextInt();
        System.out.println("Each hamburger has " + hamburger.getFat() + " of fat, " + hamburger.getCarbohydrates() + " of carbohydrates, " 
                            + hamburger.getFiber() + " of fiber. ");
        System.out.print("Enter number of salads: ");
        menuSalad = sc.nextInt();
        System.out.println("Each salad has " + salad.getFat() + " of fat, " + salad.getCarbohydrates() + " of carbohydrates, " 
                            + salad.getFiber() + " of fiber. ");
        System.out.print("Enter number of french fries: ");
        menuFrenchfries = sc.nextInt();
        System.out.println("Each french fries has " + frenchfries.getFat() + " of fat, " + frenchfries.getCarbohydrates() + " of carbohydrates, " 
                            + frenchfries.getFiber() + " of fiber. ");
        System.out.print("Enter number of soda: ");
        menuSoda = sc.nextInt();
        System.out.println("Each soda has " + soda.getFat() + " of fat, " + soda.getCarbohydrates() + " of carbohydrates, " 
        + soda.getFiber() + " of fiber. ");

        sc.close();

        totalPrice = ((hamburger.getPrice() * menuHamburger) + (salad.getPrice() * menuSalad) + (frenchfries.getPrice() * menuFrenchfries) 
                     +(soda.getPrice() * menuSoda));
        
        System.out.println("Your order comes to: " + money.format(totalPrice));
    }
}