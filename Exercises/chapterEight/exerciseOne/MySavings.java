package Exercises.chapterEight.exerciseOne;

import java.util.Scanner;

public class MySavings {
    public static void main(String[] args) {
        int get = 0;
        Scanner in = new Scanner(System.in);
        PiggyBank bank = new PiggyBank();

        do {
            System.out.println("1. Show total in bank");
            System.out.println("2. Add a penny.");
            System.out.println("3. Add a nickel");
            System.out.println("4. Add a dime");
            System.out.println("5. Add a quarter");
            System.out.println("6. Take money out of bank");
            System.out.println("Enter 0  to quit");
            System.out.print("Enter your choice: ");
            get = in.nextInt();

            switch (get) {
                case 1:
                    bank.showTotal();
                    break;
                case 2:
                    bank.addPenny();
                    break;
                case 3:
                    bank.addNickel();
                    break;
                case 4:
                    bank.addDime();
                    break;
                case 5:
                    bank.addQuarter();
                    break;
                case 6:
                    bank.emptyBank();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Input");
            }
            System.out.println();
        } while (get != 0);

        
        in.close();
    }
}
