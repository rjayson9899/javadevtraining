/*
This program was developed by Macario Peralta V

*/
import java.util.Scanner;


public class ChapterSixExercise {

    public static void runExerciseOne(){
        double numb;
        double factor;

        Scanner userIn = new Scanner (System.in);
      
        do{      

            System.out.println("Please input a number: ");
            numb = userIn.nextInt();
            if (factor){
                System.out.println("Number is a prime number. ");
            }
            else {
                System.out.println("not a prime number.");
            }
        }
        while (!(numb % 2 == 0 && !(numb / 2 != 0)));
    }

    
    public static void main(String[] args)throws Exception{
        runExerciseOne();
    }
}
