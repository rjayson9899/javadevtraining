/*
* Made by: Roger Jayson M. Mendez III
* Began: 4/22/22
* Last Modified: 4/25/22 
* This program contains my answers to the exercises located in
* Chapter 6 of the Java programming guide
*/
package Exercises.chapterSix;

import java.util.Scanner;
public class Exercises {

    /*
     * User is asked to input two numbers.
     * The program will check if the inputs are prime numbers
     * and will then print whichever number is prime
     */
    public static void runExerciseOne(Scanner in) {
        boolean[] isPrime = new boolean[2];
        int[] get = new int[2];

        System.out.print("Enter the first value: ");
        get[0] = in.nextInt();
        System.out.print("Enter the second value: ");
        get[1] = in.nextInt();

        isPrime[0] = true;
        isPrime[1] = true;
        for (int i = 0; i < 2; i++) {
            for (int j = 2; j < Math.round((double) get[i] / 2.0); j++) {
                if ((get[i]%j) == 0) {
                    isPrime[i] = false;
                }
            }
        }

        if (isPrime[0] && isPrime[1]) {
            System.out.println(get[0] + " and " + get[1] + " are both prime");
        }
        else if (isPrime[0]) {
            System.out.println(get[0] + " is prime");
        }
        else if (isPrime[1]) {
            System.out.println(get[1] + " is prime");
        }
    }

    /*
     * Asks for an input number and
     * computes for the prime factors
     */
    public static void runExerciseTwo (Scanner in) {
        int cnt = 2;
        int get;
        
        System.out.print("Input a positive integer: ");
        get = in.nextInt();

        System.out.print("The prime factors are: ");
        do {
            if ((get % cnt) == 0) {
                get /= cnt;
                System.out.print(cnt + " ");
            }
            else {
                cnt++;
            }
        } while (get != 1);
    }

    /*
     * Asks for an integer as input and prints each
     * digit from highest to lowest place
     */
    public static void runExerciseFive (Scanner in) {
        int get, length;
        String lengthBuffer;

        System.out.print("Enter a positive integer: ");
        get = in.nextInt();

        lengthBuffer = Integer.toString(get);
        length = lengthBuffer.length();

        for (int i = (length - 1); i >= 0; i--) {
            double power = Math.pow(10, i);
            int digit = get / (int) power;
            get -= digit * (int) power;
            System.out.println(digit);
        }
    }

    /*
     * Asks for two integer inputs and outputs
     * and computes for the GCD of the two
     */
    public static void runExerciseTen (Scanner in) {
        int num1, num2, temp;

        System.out.print("Enter first digit: ");
        num1 = in.nextInt();
        System.out.print("Enter second digit: ");
        num2 = in.nextInt();

        while (num2 > 0) {
            temp = num1 % num2;
            num1 = num2;
            num2 = temp;
        }

        System.out.print("The GCD is: " + num1);
    }

    /*
     * Program will ask for the current time and 
     * how many hours the user wishes to pass the time.
     * Will return the final time.
     */
    public static void runExerciseEleven(Scanner in) {
        int hourIn, hourElapse, hourOut;
        String timeString;

        System.out.print("Enter current time: ");
        hourIn = in.nextInt();

        if (hourIn < 1 || hourIn > 12) {
            System.out.println("Invalid input");
            return;
        }

        System.out.print("Enter am or pm: ");
        in.nextLine();
        timeString = in.nextLine();

        if (!(timeString.equalsIgnoreCase("am")) && !(timeString.equalsIgnoreCase("pm"))) {
            System.out.println("Invalid input");
            return;
        }

        System.out.print("Enter amount of hours elapsed: ");
        hourElapse = in.nextInt();

        while(hourElapse > 12) {
            if (timeString.equalsIgnoreCase("am")) {
                timeString = "pm";                    
            }
            else if (timeString.equalsIgnoreCase("pm")) {
                timeString = "am";
            }
            hourElapse -= 12;
        }

        if ((hourIn + hourElapse) > 12) {
            if (timeString.equalsIgnoreCase("am")) {
                timeString = "pm";                    
            }
            else if (timeString.equalsIgnoreCase("pm")) {
                timeString = "am";
            }
            hourOut = (hourIn + hourElapse) % 12;
        }
        else {
            hourOut = hourIn + hourElapse;
        }

        System.out.println("The time is now " + hourOut + ":00 " + timeString);
    }

    /*
     * Gets two integer inputs and solves for
     * the necklace sequence
     */
    public static void runExcerciseTwelve(Scanner in) {
        int get1, get2, temp1, temp2, res;

        System.out.print("Enter first digit: ");
        get1 = in.nextInt();

        if (get1 < 0 || get1 > 9) {
            System.out.println("Invalid input");
            return;
        }

        System.out.print("Enter second digit: ");
        get2 = in.nextInt();

        if (get2 < 0 || get2 > 9) {
            System.out.println("Invalid input");
            return;
        }

        System.out.print(get1 + " " + get2 + " ");
        temp1 = get1;
        temp2 = get2;
        do {
            res = (temp1 + temp2) % 10;
            System.out.print(res + " ");
            temp1 = temp2;
            temp2 = res;
        } while ((temp1 != get1) || (temp2 != get2));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] exercises = new String[] {"Exercise One", "Exercise Two", "Exercise Five", "Exercise Ten", 
            "Exercise Eleven", "Exercise Twelve"};
        int sel;
        int i = 1;

        for (String element: exercises) {
            System.out.println(i + ". " + element);
            i++;
        }
        System.out.print("Select Exercise to test: ");
        sel = in.nextInt();

        switch (sel) {
            case 1:
                runExerciseOne(in);
                break;
            case 2:
                runExerciseTwo(in);
                break;
            case 3:
                runExerciseFive(in);
                break;
            case 4:
                runExerciseTen(in);
                break;
            case 5:
                runExerciseEleven(in);
                break;
            case 6:
                runExcerciseTwelve(in);
                break;
        }
        
        in.close();
    }
}