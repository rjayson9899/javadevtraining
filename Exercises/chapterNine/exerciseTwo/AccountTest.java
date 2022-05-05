package Exercises.chapterNine.exerciseTwo;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input starting balance for both accounts: ");
        double bal = in.nextDouble();

        PersonalAcct test1 = new PersonalAcct(bal, "Test", "One", "street 1", "city 1", "state 1", "0001");
        BusinessAcct test2 = new BusinessAcct(bal, "Tset", "Two", "street 2", "city 2", "state 2", "0002");
        System.out.println("Test 1 balance: " + test1.getBalance());
        System.out.println("Test 2 balance: " + test2.getBalance());

        System.out.println();

        System.out.println("Personal Account Method Sweep:");
        test1.deposit(bal);
        System.out.println("Test 1 balance: " + test1.getBalance());
        test1.withdrawal(bal);
        System.out.println("Test 1 balance: " + test1.getBalance());
        System.out.println(test1.toString());

        System.out.println("\nBusiness Account Method Sweep:");
        test2.deposit((bal));
        System.out.println("Test 2 balance: " + test2.getBalance());
        test2.withdrawal(bal);
        System.out.println("Test 2 balance: " + test2.getBalance());
        System.out.println(test2.toString());

        in.close();
    }
}