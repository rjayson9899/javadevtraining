package ProgrammingInJava.chapter6;

import java.util.Scanner;

public class LoopTest{
    public static void main(String[] args) {
        int playerNum;
        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Enter a number less than 4: ");
            playerNum = input.nextInt();
        } while (playerNum >= 4);
        input.close();
    }
}