package chapter4exer;

import java.util.Scanner;

public class exer2 {
    public static void main(String[] args) {
        double total, inputNum;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the diameter of the pizza in inches: ");
        inputNum = input.nextDouble();

        total = (0.05 * inputNum * inputNum) + 1 + 0.75;

        System.out.println("The cost of making the pizza is: $" + total );

        input.close();
    }
}
