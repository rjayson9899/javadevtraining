package chapter9exer2;

import java.text.NumberFormat;

public class Account {
    private double balance;
    private Customer cust;

    public Account(double bal, String fName, String lName,
                    String str, String city, String st, String zip){
    
    balance = bal;
    cust = new Customer(fName, lName, str, city, st, zip);
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double bal){
        balance = bal;
    }

    public void deposit(double amt){
        balance += amt;
    }

    public void withdrawal(double amt){
        if(amt <= balance){
            balance -= amt;
        }
        else{
            System.out.println("Not enough money in account.");
        }
    }

    public String toString(){
        String accountString;
        NumberFormat money = NumberFormat.getCurrencyInstance();

        accountString = cust.toString();
        accountString += "Current Balance is " + money.format(balance);

        return accountString;
    }
}
