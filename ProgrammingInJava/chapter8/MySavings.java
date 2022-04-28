package ProgrammingInJava.chapter8;

import java.util.Scanner;

public class MySavings{
    public static void main(String[] args) {
        int choice = 0;
        boolean exitSENTINEL = false;

        Scanner sc = new Scanner(System.in);
        PiggyBank pb = new PiggyBank();

        while(!exitSENTINEL){
            System.out.println("1. Show total in bank.");
            System.out.println("2. Add a penny.");
            System.out.println("3. Add a nickel.");
            System.out.println("4. Add a dime.");
            System.out.println("5. Add a quarter.");
            System.out.println("6. Take money out of the bank.");
            System.out.println("Enter 0 to quit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 0: 
                    exitSENTINEL = true;
                    break;
                case 1:
                    pb.displayTotalValue();
                    break;
                case 2:
                    pb.addPenny();
                    break;
                case 3:
                    pb.addNickel();
                    break;
                case 4:
                    pb.addDime();
                    break;
                case 5:
                    pb.addQuarter();
                    break;
                case 6:
                    pb.convertCoinstoDollar();
                    break;
    
                default:
                System.out.println("Enter a valid choice!");
                break;
            }
        }sc.close();
    }
}
