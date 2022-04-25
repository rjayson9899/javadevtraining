package chapter8exer;

import java.util.Scanner;

public class MySavings {
    public static void main(String[] args) {
        int choice = 0;
        Scanner input = new Scanner(System.in);
        PiggyBank bank = new PiggyBank();



        do{
            System.out.print("\033[H\033[2J");
            System.out.println("--------------------------");
            System.out.println("Welcome to your piggybank!");
            System.out.println("--------------------------");
            System.out.println("1. Show total in bank.");
            System.out.println("2. Add a penny.");
            System.out.println("3. Add a nickel.");
            System.out.println("4. Add a dime.");
            System.out.println("5. Add a quarter.");
            System.out.println("6. Take money out of bank.");
            System.out.println("Enter 0 to quit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch(choice){

                case 1: 
                    bank.getTotal();
                    break;

                case 2:
                    bank.setPenny(1);
                    System.out.println("Successfully added a penny!");
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    break;
                
                case 3:
                    bank.setNickel(1);
                    System.out.println("Successfully added a nickel!");
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    break;
                
                case 4:
                    bank.setDime(1);
                    System.out.println("Successfully added a dime!");
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    break;
                
                case 5:
                    bank.setQuarter(1);
                    System.out.println("Successfully added a quarter!");
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    break;

                case 6:
                    bank.cashOut();
                    System.out.println("Successfully added a quarter!");
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    break;
                
                case 0:
                    System.exit(0);
                    break;
                
                default:
                    System.out.println("wrong input!");
            }





        }while(choice != 0);
        
        input.close();
    }
}
