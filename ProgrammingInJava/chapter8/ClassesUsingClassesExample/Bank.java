package ProgrammingInJava.chapter8.ClassesUsingClassesExample;

import java.util.Scanner;
import java.text.NumberFormat;

public class Bank{
    public static void main(String[] args) {
        Account munozAccount = new Account(250, "Maria", "Munoz", "110 Glades Road", "Mytown", "FL", "33445");
        Scanner input = new Scanner (System.in);
        double data;
        String newStreet, newCity, newState, newZip;
        NumberFormat money = NumberFormat.getCurrencyInstance();
    
        System.out.println(munozAccount);
    
        System.out.print("Enter deposit amount: ");
        data = input.nextDouble();
        munozAccount.deposit(data);
        System.out.println("Balance is: " + money.format(munozAccount.getBalance()));
    
        System.out.print("Enter withdrawal amount: ");
        data = input.nextDouble();
        input.nextLine();
        munozAccount.withdrawal(data);
        System.out.println("Balance is: " + money.format(munozAccount.getBalance()));

        System.out.print("Enter new Street: ");
        newStreet = input.nextLine();
        System.out.print("Enter new City: ");
        newCity = input.nextLine();
        System.out.print("Enter new State: ");
        newState = input.nextLine();
        System.out.print("Enter new Zip: ");
        newZip = input.nextLine();

        munozAccount.changeAddress(newStreet, newCity, newState, newZip);
        System.out.print(munozAccount);

        input.close();
    }
}