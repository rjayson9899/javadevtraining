package Exercises.chapterSeven;

import java.util.Scanner;
import java.util.Random;

public class exerciseNine {
    public static int startUserTurn(int stones, int get) {
        stones -= get;
        if (stones == 0) {
            System.out.println("You have lost. Better Luck next time");
        }
        return stones;
    }

    public static int startCompTurn(int stones, Random rand) {
        int compTake;

        if (stones >= 3) {
            compTake = rand.nextInt(3) + 1;
            stones -= compTake;
        }
        else {
            compTake = rand.nextInt(stones) + 1;
            stones -= compTake;

        }

        System.out.println("Computer takes " + compTake + " stones...");

        if (stones == 0) {
            System.out.println("You win!!!");
        }

        return stones;
    }

    public static boolean isValidEntry(int stones, int get) {
        if (stones > 3) {
            if (get > 3 || get < 1) {
                System.out.println("Invalid input, input again");
                return false;
            }
            else {
                return true;
            }
        }
        else {
            if (get > stones || get < 1) {
                System.out.println("Invalid input, input again");
                return false;
            }
            else {
                return true;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int get, stones;
        Random rand = new Random();

        stones = rand.nextInt(11) + 20;

        while (stones > 0) {
            System.out.println(stones + " stones remain...");

            do {
                System.out.print("Input amount to get (min 1, max 3): ");
                get = in.nextInt();
            } while( !(isValidEntry(stones, get)) );

            stones = startUserTurn(stones, get);

            if (stones > 0) {
                stones = startCompTurn(stones, rand);
            }
        }

        in.close();
    }
}
