package ProgrammingInJava.chapter10.CaseStudy;

import java.util.Scanner;
import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<Account>();
    }

    public void addAccount() {
        Account newAcct;
        double bal;
        String firstName, lastName;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        firstName = input.nextLine();
        System.out.print("Enter your last name: ");
        lastName = input.nextLine();
        System.out.print("Input Beginning Balance: ");
        bal = input.nextDouble();
        input.nextLine();

        newAcct = new Account(bal, firstName, lastName);
        accounts.add(newAcct);

        System.out.println("Account successfully created.");
        System.out.println("Your Account ID is: " + newAcct.getID());
    }

    public void deleteAccount(String acctID) {
        int acctIndex;
        Account acctToMatch;
        acctToMatch = new Account(acctID);
        acctIndex = accounts.indexOf(acctToMatch);  //retrieve location of account
        if (acctIndex > -1){
            accounts.remove(acctIndex);             //remove account
            System.out.println("Account removed");
        } else {
            System.out.println("Account does not exist.");  
        }
    }

    //transCode of 1 is for deposit
    //transCode of 2 is for withdrawal

    public void transaction(int transCode, String acctID, double amt) {
        int acctIndex;
        Account acctToMatch, acct;

        acctToMatch = new Account(acctID);
        acctIndex = accounts.indexOf(acctToMatch);  //retrieve location of account
        if (acctIndex > -1){
            acct = (Account)accounts.get(acctIndex); //retrieve object to modify
            if (transCode == 1){
                acct.deposit(amt);
                accounts.set(acctIndex, acct);      //replace object with updated object
                System.out.println(acct);
            } else if (transCode == 2) {
                acct.withdrawal(amt);
                accounts.set(acctIndex, acct);      //replace object with updated object
                System.out.println(acct);
            }
        } else {
            System.out.println("Account does not exist.");
        }
    }

    public void checkBalance(String acctID) {
        int acctIndex;
        Account acctToMatch, acct;

        acctToMatch = new Account(acctID);
        acctIndex = accounts.indexOf(acctToMatch);      //retrieve location of account
        if (acctIndex > -1) {
            acct = (Account)accounts.get(acctIndex);    //retrieve object to display
            System.out.println(acct);
        } else {
            System.out.println("Account does not exist.");
        }
    }
}
