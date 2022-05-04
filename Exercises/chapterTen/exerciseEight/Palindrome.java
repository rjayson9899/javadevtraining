package Exercises.chapterTen.exerciseEight;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String inputString, reverseString;
        char[] reverseArray;
        Scanner in = new Scanner(System.in);
        int stringLength;

        System.out.print("Input a string: ");
        inputString = in.nextLine();
        inputString = inputString.replaceAll(" ", "");
        stringLength = inputString.length();

        reverseArray = new char[stringLength];
        for(int x = 0; x < stringLength; x++) {
            reverseArray[x] = inputString.charAt((stringLength - (x + 1)));
        }

        reverseString = new String(reverseArray);
        if (inputString.equalsIgnoreCase(reverseString)) {
            System.out.println("Match");
        }
        else {
            System.out.println("Mismatch");
        }

        in.close();
    }
}
