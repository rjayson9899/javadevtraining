/*
This project was developed by Macario Peralta V

*/

import java.util.Scanner;

public class ChapterFourExercise {
   
    public static void runExerciseSeven(){
        int userInput;
        int hundreds,tens,ones;

        Scanner user = new Scanner(System.in);
        System.out.println("Enter a number that has 3 digits: ");
        userInput = user.nextInt();

        hundreds = userInput/100;
        tens = (userInput%100)/10;
        ones = (userInput%100)%10;
        
        System.out.println(hundreds);
        System.out.println(tens);
        System.out.println(ones);
    }

    public static void runExerciseEleven(){

    }

    public static void runExerciseThirteen(){

    }

    public static void runExerciseSixteen(){

    }
    public static void main(String[] args){
        int choice;

        Scanner userIn = new Scanner(System.in);

        System.out.println("Please choose what exercise: ");
        System.out.println("1. Exercise Seven");
        System.out.println("2. Exercise Eleven");
        System.out.println("3. Exercise Thirteen");
        System.out.println("4. Exercise Sixteen");
        choice = userIn.nextInt();

        switch(choice){

            case 1:
            runExerciseSeven();
            break;

            case 2:
            runExerciseEleven();
            break;

            case 3:
            runExerciseThirteen();
            break;

            case 4:
            runExerciseEleven();
            break;

        }

    }
}
