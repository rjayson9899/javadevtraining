package chapter10exer8;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String palindrome;
        int backCount;
        Boolean isPalindrome = false;

        System.out.print("Input a word: ");
        palindrome = input.nextLine();

        palindrome = palindrome.replaceAll("\\s", "");
        palindrome = palindrome.toLowerCase();

        backCount = palindrome.length() - 1;

        for(int x = 0; x <= backCount; x++){
            if(palindrome.charAt(x) == palindrome.charAt(backCount) && x != backCount){
                isPalindrome = true;
            } 
            else{
                isPalindrome = false;
            }
            backCount--;
        }

        if(isPalindrome == true){
            System.out.println("The word " + palindrome + " is a palindrome!");
        }
        else{
            System.out.println("The word " + palindrome + " is not a palindrome!");
        }

        input.close();
    }
}
