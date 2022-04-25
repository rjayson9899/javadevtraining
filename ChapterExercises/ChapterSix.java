/*
 This program was developed by Macario Peralta V.
 The purpose of this program is to help the developer 
 exercise and gain more experience with coding in Java.
 Most of the codes in here are 
 */

import java.util.Scanner;
public class ChapterSix {

    //this program asks the user for 2 numbers and will only continue as long as the answer is correct.
    public static void runPrompter(){
        int inOne,inTwo,comp;
       
       Scanner userIn = new Scanner(System.in);
       
       System.out.println("Please enter 2 numbers. ");
       System.out.println("Enter the minimum number: ");
       inOne = userIn.nextInt();
       System.out.println("Enter the maximum number: ");
       inTwo = userIn.nextInt();
       System.out.println("The number you have enter are: " + inOne + " and " + inTwo);
       
        do{
        
            System.out.println("Enter a number between " + inOne + " and " + inTwo);
            comp = userIn.nextInt();
           
            if(comp > inOne && comp < inTwo){
                System.out.println("The number that you have entered is valid.");
            }
            else 
            System.out.println("The number that you have entered is invalid.");
       }
       while( comp < inOne && comp > inTwo );
    }
    
    //this program just shows even number from 1-20.
    public static void runEven(){
        int newValue = 0;
        
        for( int x = 0; x < 10; x++){
            newValue += 2;
            System.out.println(newValue);
        }
    }
    
    //this program prompts user for a number, counts from 1 up to the number and then adds the sum.
    public static void runNumberSum(){
        int user, sum = 0;
        int counter = 0;
        
        Scanner userIn = new Scanner(System.in);
        
        System.out.println("Please enter a number: ");
        user = userIn.nextInt();
        for (int x = 0; user > x; x++){
            counter += 1;
            sum += counter;
            System.out.println(counter);
        }
        System.out.println("Total sum is: " + sum );
        
    }
    
    //this program prompts user for scores and only shows those above 70%
    public static void runPercentPassing(){
        Double number,score = 0.0;
        Double counter = 0.0;
        double percentage;
        
        Scanner userIn = new Scanner(System.in);
        
        System.out.println("Enter how scores you are calculating for.");
        number = userIn.nextDouble();
        
        for (int x = 0; x < number; x++){
            System.out.println("Enter the scores: ");
            score = userIn.nextDouble();

            if (score >= 70){
                counter += 1;
            }
        }

        percentage = (counter/number)*100;
        System.out.println("You have " + percentage + "% scores that are over 70%. ");
    }

    public static void runFactorial(){
        double asd;
        double total = 0, counter;

        Scanner userIn = new Scanner(System.in);

        System.out.println("Enter a number: ");
        asd = userIn.nextDouble();
        total = asd;
        for(double x = asd; x > 1; x--){
            counter = x - 1;
            System.out.println(counter);

            total = total*counter;
            System.out.println(total);
        }

    }
    public static void main(String[] args){
        runFactorial();
        /*   int choice;

        Scanner userIn = new Scanner(System.in);

        System.out.println("Please choose what exercise: ");
        System.out.println("1. Exercise Seven");
        System.out.println("2. Exercise Eleven");
        System.out.println("3. Exercise Thirteen");
       // System.out.println("4. Exercise Sixteen");
        choice = userIn.nextInt();

        switch(choice){

            case 1:
            runPrompter();
            break;

            case 2:
            runEven();
            break;

            case 3:
            runPercentPassing();
            break;

            case 4:
            runExerciseEleven();
            break;
            
        }
        */
    }
    
}

