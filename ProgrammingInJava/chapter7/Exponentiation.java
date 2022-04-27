package ProgrammingInJava.chapter7;
import java.util.Scanner;

public class Exponentiation {
    public static double powerOf(double base, double exponent){
        double xPower;

        xPower = (Math.pow(base,exponent));
        return(xPower);
    }
    public static void main(String[] args) {
        double input1, input2;
        double answer;

        Scanner input = new Scanner (System.in);
        System.out.print("Enter a number: ");
        input1 = input.nextDouble();
        System.out.print("Raise to? : ");
        input2 = input.nextDouble();
        input.close();
        answer = powerOf(input1, input2);

        System.out.print(answer);
    }
}