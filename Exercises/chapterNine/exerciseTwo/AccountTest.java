package Exercises.chapterNine.exerciseTwo;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double bal = in.nextDouble();

        PersonalAcct test1 = new PersonalAcct(bal, "test", "one", "street 1", "city 1", "state 1", "0001");
        BusinessAcct test2 = new BusinessAcct(bal, "tset", "two", "street 2", "city 2", "state 2", "0002");
        test1.printBal();
        test2.printBal();


        System.out.println("Personal Account Method Sweep:");
        test1.deposit((bal/4));
        test1.printBal();
        test1.deposit(-bal);
        test1.printBal();
        test1.withdrawal((bal*2));
        test1.printBal();
        test1.withdrawal(-bal);
        System.out.println(test1.toString());

        System.out.println("\nBusiness Account Method Sweep:");
        test2.deposit((bal/4));
        test2.printBal();
        test2.deposit(-bal);
        test2.printBal();
        test2.withdrawal((bal*2));
        test2.printBal();
        test2.withdrawal(-bal);
        System.out.println(test2.toString());

        in.close();
    }
}