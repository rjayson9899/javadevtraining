package ProgrammingInJava.chapter10.CaseStudy;

import java.util.Scanner;

public class LocalBank {
    public static void main(String[] args) {
        Bank easySave = new Bank();
        Scanner input = new Scanner(System.in);
        String action, acctID;
        Double amt;

        do {
            System.out.println("\nLocal Bank Application in Java\n");
            System.out.println("[D] Deposit");
            System.out.println("[W] Withdrawal");
            System.out.println("[C] Check Balance");
            System.out.println("[A] Add an account");
            System.out.println("[R] Remove an account");
            System.out.println("[M] Modify an account");
            System.out.println("[Q] Quit\n");
            System.out.print("Enter choice: ");
            action = input.nextLine();

            if (action.equalsIgnoreCase("A")) {
                easySave.addAccount();
            } 
            else if(!action.equalsIgnoreCase("Q")) {
                
                System.out.print("Enter account ID: ");
                acctID = input.nextLine();
                
                if (action.equalsIgnoreCase("D")) {
                    System.out.print("Enter deposit amount: ");
                    amt = input.nextDouble();
                    input.nextLine();
                    easySave.transaction(1, acctID, amt);
                } else if (action.equalsIgnoreCase("W")) {
                    System.out.print("Enter withdrawal amount: ");
                    amt = input.nextDouble();
                    input.nextLine();
                    easySave.transaction(2, acctID, amt);
                } else if (action.equalsIgnoreCase("C")) {
                    easySave.checkBalance(acctID);
                } else if (action.equalsIgnoreCase("R")) {
                    easySave.deleteAccount(acctID);
                } else if (action.equalsIgnoreCase("M")){
                    easySave.modifyAccount(acctID);
                }
            }    
        } while (!action.equalsIgnoreCase("Q"));
        input.close();
    }
}
