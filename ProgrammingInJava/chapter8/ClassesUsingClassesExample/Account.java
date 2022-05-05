package ProgrammingInJava.chapter8.ClassesUsingClassesExample;

import java.text.NumberFormat;

public class Account{
    private double balance;
    private Customer cust;

    public Account(double balance, String firstName, String lastName, String street, String city, String state, String zip){
        this.balance = balance;
        cust = new Customer(firstName, lastName, street, city, state, zip);
    }

    public void changeAddress(String street, String city, String state, String zip){
        cust.changeStreet(street);
        cust.changeCity(city);
        cust.changeState(state);
        cust.changeZip(zip);
    }

    public double getBalance() {
        return(balance);
    }

    public void deposit(double amt){
        balance += amt;
    }

    public void withdrawal(double amt){
        if (amt <= balance) {
            balance -= amt;
        } else {
            System.out.println("Not enough money in account.");
        }
    }

    public String toString(){
        String accountString;
        NumberFormat money = NumberFormat.getCurrencyInstance();

        accountString = cust.toString();
        accountString += "Current balance is " + money.format(balance);
        return(accountString);
    }
}