package ProgrammingInJava.chapter10;

import java.util.Random;
public class EvensAndOdds {
    public static void main(String[] args) {
        int [] numbers = new int [25];
        int [] oddNumbers = new int [25];
        int [] evenNumbers = new int [25];
        int odd = 0;
        int even = 0;
        Random rand = new Random();
        
        for (int x = 0; x < numbers.length; x++){
            numbers[x] = rand.nextInt(100);
        } 

        for (int i = 0; i < 25; i++){
            if (numbers[i] % 2 == 0) {
                evenNumbers[even] = numbers[i];
                even++;
            } else {
                oddNumbers[odd] = numbers[i];
                odd++;
            }
        }

        System.out.print("Even: ");
        for (int x = 0; x < even; x++){
            System.out.print(evenNumbers[x] + " ");
        }

        System.out.print("\nOdd: ");
        for (int x = 0; x < odd; x++){
            System.out.print(oddNumbers[x] + " ");
        }
    }
}
