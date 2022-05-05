package ProgrammingInJava.chapter9.exercise2;

import java.util.Scanner;
import java.text.NumberFormat;

public class AccountTest {
    public static void main(String[] args) {
        PersonalAcct aldeaPersonalAcct = new PersonalAcct(500.00, "Edmark", "Aldea", "43 Molave", "Quezon City", "MM", "1126");
        BusinessAcct cobaltBusinessAcct = new BusinessAcct(1000.00, "Jayson", "Cobalt", "56 Yakal", "City of Manila", "MM", "1234");
        Scanner input = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        double cash;
        String newStreet,newCity, newState, newZip;

        //Personal Acct Test
        System.out.println(aldeaPersonalAcct);
        System.out.print("Enter a deposit amount: ");
        cash = input.nextDouble();
        aldeaPersonalAcct.deposit(cash);
        System.out.println("Current Balance is: " + money.format(aldeaPersonalAcct.getBalance()));

        System.out.print("Enter a withdrawal amount: ");
        cash = input.nextDouble();
        input.nextLine();
        aldeaPersonalAcct.withdrawal(cash);
        System.out.println("Current Balance is: " + money.format(aldeaPersonalAcct.getBalance()));

        //Withdraw amount that will fall below 100$ minimum balance and deduct 2$
        System.out.print("Enter a withdrawal amount: ");
        cash = input.nextDouble();
        input.nextLine();
        aldeaPersonalAcct.withdrawal(cash);
        aldeaPersonalAcct.minimumBalance();
        System.out.println("Current Balance is: " + money.format(aldeaPersonalAcct.getBalance()));


        //Change address functionality
        System.out.print("Enter new Street: ");
        newStreet = input.nextLine();
        System.out.print("Enter new City: ");
        newCity = input.nextLine();
        System.out.print("Enter new State: ");
        newState = input.nextLine();
        System.out.print("Enter new Zip: ");
        newZip = input.nextLine();

        aldeaPersonalAcct.changeAddress(newStreet, newCity, newState, newZip);
        System.out.println(aldeaPersonalAcct);
        System.out.println("\n");

        //Business Acct Test
        System.out.println(cobaltBusinessAcct);
        System.out.print("Enter a deposit amount: ");
        cash = input.nextDouble();
        cobaltBusinessAcct.deposit(cash);
        System.out.println("Current Balance is: " + money.format(cobaltBusinessAcct.getBalance()));

        System.out.print("Enter a withdrawal amount: ");
        cash = input.nextDouble();
        input.nextLine();
        cobaltBusinessAcct.withdrawal(cash);
        System.out.println("Current Balance is: " + money.format(cobaltBusinessAcct.getBalance()));

        //Withdraw amount that will fall below 500$ minimum balance and deduct 10$
        System.out.print("Enter a withdrawal amount: ");
        cash = input.nextDouble();
        input.nextLine();
        cobaltBusinessAcct.withdrawal(cash);
        cobaltBusinessAcct.minimumBalance();
        System.out.println("Current Balance is: " + money.format(cobaltBusinessAcct.getBalance()));

        //Change address functionality
        System.out.print("Enter new Street: ");
        newStreet = input.nextLine();
        System.out.print("Enter new City: ");
        newCity = input.nextLine();
        System.out.print("Enter new State: ");
        newState = input.nextLine();
        System.out.print("Enter new Zip: ");
        newZip = input.nextLine();

        cobaltBusinessAcct.changeAddress(newStreet, newCity, newState, newZip);
        System.out.println(cobaltBusinessAcct);

        input.close();

    }
}
