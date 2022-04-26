package chapter7exer;
import java.util.Scanner;

public class exer3 {

    public static Boolean isPrime(double num1){
        boolean prime = false;
        for(int x = 2; x <= num1 / 2; x++){
            if(num1 % x == 0){
                prime = true;
                break;
            }

        }     
        return prime;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0;

        System.out.print("Input the first number: ");
        num1 = input.nextInt();

        if(isPrime(num1) == true){
            System.out.println("The number is not a prime number.");
        }

        else{
            System.out.println("The number is a prime number.");
        }

        

        input.close();
    }
}
