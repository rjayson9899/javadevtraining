package ProgrammingInJava.chapter7;
import java.util.Scanner;

public class SpanishNumbers2{
    public static void displaySpanishNumbers(int nums) {
        String[] numbers = {"uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez"};
        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.print(numbers[nums - 1]);
    }
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number from 1 - 10: ");
        choice = input.nextInt();
        input.close();
        displaySpanishNumbers(choice);
    }
}