package ProgrammingInJava.chapter6;
import java.util.Scanner;

public class StringTest{
    public static void middleStringFinder() {
        String phrase, threeLetters;
        int phraseLength;
        int mid;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a text that contains at least 3 characters: ");
        phrase = input.nextLine();
        input.close();

        phraseLength = phrase.length();
        mid = phraseLength / 2;
        threeLetters = phrase.substring(mid - 1, mid + 2);
        System.out.println("Middle 3 characters are: " + threeLetters);
    }

    public static void loginSetup(){
        String user, password;
        int passLength;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a user name: ");
        user = input.nextLine();
        System.out.print("Enter a password: ");
        password = input.nextLine();
        
        passLength = password.length();

        if(passLength < 8){
            System.out.print("Enter a password: ");
            password = input.nextLine();

            user = user.toLowerCase();
            password = password.toLowerCase();
            System.out.print("Your username is: " + user + " Your password is: " + password);
        }
        input.close();
    }


    public static void main(String[] args) {
        loginSetup();
    }
}
