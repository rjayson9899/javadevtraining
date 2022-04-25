/*
 This program was developed by Macario Peralta V.
 The purpose of this program is to help the developer 
 exercise and gain more experience with coding in Java.
 Most of the codes in here are 
 */
package chapterthree;

import java.util.Scanner;

public class ChapterSix {
    
    // The purpose of this program is to enable the user to 
    
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
    
    public static void runEven(){
        int newValue = 0;
        
        for( int x = 0; x < 10; x++){
            newValue += 2;
            System.out.println(newValue);
        }
    }
    
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
    
    public static void runPercentPassing(){
        int score;
        
        Scanner userIn = new Scanner(System.in);
        
        System.out.println("Enter the scores that you have.");
        score = userIn.nextInt();
        
        for (int x = 0; x < score; x++){
            
        }
    }
    public static void main(String[] args){
       runNumberSum();
    }
}

