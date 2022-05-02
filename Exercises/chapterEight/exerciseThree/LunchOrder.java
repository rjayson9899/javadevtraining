package Exercises.chapterEight.exerciseThree;

import java.util.Scanner;
import java.text.NumberFormat;

public class LunchOrder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Food burger = new Food(1.85, 9.0, 33.0, 1.0);
        Food salad = new Food(2.0, 1.0, 11.0, 5.0);
        Food fries = new Food(1.3, 11.0, 36.0, 4.0);
        Food soda = new Food (0.95, 0.0, 38.0, 0.0);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        int getBurger, getSalad, getFries, getSoda;
        double finalPrice;

        System.out.print("Enter amount of hamburgers: ");
        getBurger = in.nextInt();
        System.out.println("Each hamburger has " + burger.getFat() + "g of fat, " + burger.getCarbs() + 
            "g of carbohydrates, and " + burger.getFiber() + "g of fiber" + "\n");

        System.out.print("Enter amount of salads: ");
        getSalad = in.nextInt();
        System.out.println("Each salad has " + salad.getFat() + "g of fat, " + salad.getCarbs() + 
            "g of carbohydrates, and " + salad.getFiber() + "g of fiber" + "\n");

        System.out.print("Enter amount of french fries: ");
        getFries = in.nextInt();
        System.out.println("Each hamburger has " + fries.getFat() + "g of fat, " + fries.getCarbs() + 
            "g of carbohydrates, and " + fries.getFiber() + "g of fiber" + "\n");

        System.out.print("Enter amount of sodas: ");
        getSoda = in.nextInt();
        System.out.println("Each soda has " + soda.getFat() + "g of fat, " + soda.getCarbs() + 
            "g of carbohydrates, and " + soda.getFiber() + "g of fiber" + "\n");

        finalPrice = (burger.getPrice() * getBurger) + (salad.getPrice() * getSalad) + (fries.getPrice() * getFries)
                        + (soda.getPrice() * getSoda);
        
        System.out.println("Your order comes to: " + money.format(finalPrice));

        in.close();
    }
}
