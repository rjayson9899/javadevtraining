package ProgrammingInJava.chapter10;

import java.util.Scanner;

public class ReverseName {
    public static void main(String[] args) {
        String name = "";
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = input.nextLine();
        name = name.toUpperCase();
        char [] reverseName = name.toCharArray();

        System.out.print("Your name backwards is: ");
        for (int i = reverseName.length - 1; i >= 0; i--){
            System.out.print(reverseName[i]);
        }
        input.close();
    }
}
