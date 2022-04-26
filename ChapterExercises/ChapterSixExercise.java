/*
This program was developed by Macario Peralta V

*/
import java.util.Scanner;

public class ChapterSixExercise {

    public static void runExerciseOne(){
        double numb;
        boolean count;

        Scanner userIn = new Scanner (System.in);

        System.out.println("Please input a number: ");
        numb = userIn.nextInt();
        count = false;
        for (int i = 2; i <= numb/2; i++){

            if(numb % i == 0){
                count = true;
                break;
            }
        }
            if (!count){
                System.out.println("Number is a prime number. ");
            }
            else {
                System.out.println("not a prime number.");
            }

    }
        
    public static void runExerciseThree(){
        double invest = 2500;
        double finalz = 5000;
        double rate = 0.075;
        int counter = 0;

        while(invest < finalz){
            counter += 1;
            invest += invest*rate;
        }
        System.out.println(counter);
        System.out.println("The rate is: " + invest);
    }

    public static void runExerciseFive(){
        String user;

        Scanner userIn = new Scanner(System.in);

        System.out.println("Enter a positive integer: ");
        user = userIn.nextLine();

        for(int x = 0; user.length() > x; x++){

            char a = user.charAt(x);
            System.out.println(a);

        }

    }

    public static void runExerciseSix(){
        String user;
        int store = 0;
        Scanner userIn = new Scanner(System.in);

        System.out.println("Enter a positive integer: ");
        user = userIn.nextLine();

        for(int x = 0; user.length() > x; x++){

            store += Character.getNumericValue(user.charAt(x));
            System.out.println();

        }

        System.out.println("The sum of the digits is: " + store);
    
    }
    public static void runExerciseEleven(){

        int start;
        int day;
        int elapsed;
        boolean isAM;
        String ifAM;

        Scanner userIn = new Scanner(System.in);

        System.out.println("Enter the starting hour: ");
        start = userIn.nextInt();
        System.out.println("Enter 1 for AM and enter 2 for PM: ");
        day = userIn.nextInt();

        if (day == 1){
            isAM = true;
        }
        else {
            isAM = false;
        }

        System.out.println(isAM);
        System.out.println("Enter the number of elapsed hours: ");
        elapsed = userIn.nextInt();

        for (int y = elapsed; y > 0; y--){
    
            elapsed = elapsed - 1;
            start += 1;

            if(start > 12){

                if (day == 1){
                    isAM = false;
                }

                else if (day == 2){
                    isAM = true;
                }
                start = 1;
            } 
        }

        if (isAM == false){
            ifAM = "PM";
        }

        else {
            ifAM = "AM";
        }

        System.out.println("The time is: " + start + " " + ifAM);
    }



    
    public static void main(String[] args)throws Exception{
        runExerciseThree();
    }
}
