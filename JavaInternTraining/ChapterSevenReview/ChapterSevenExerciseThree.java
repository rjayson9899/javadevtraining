package ChapterSevenReview;
import java.util.Scanner;

public class ChapterSevenExerciseThree {
    public static boolean isPrime(double x){        
        boolean count;
        count = false;
        for (int i = 2; i <= x/2; i++){

            if(x % i == 0){
                count = true;
                break;
            }
        }
            return count;
    }
    public static void main(String[] args){
        double numb;

        Scanner userIn = new Scanner (System.in);

        System.out.println("Please input a number: ");
        numb = userIn.nextInt();
        
        isPrime(numb);
        if (!isPrime(numb)){
            System.out.println("Number is a prime number. ");
        }
        else {
            System.out.println("not a prime number.");
        }
        userIn.close();
    }
}
