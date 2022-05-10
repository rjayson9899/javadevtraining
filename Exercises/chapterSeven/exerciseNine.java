/*
 * Made by: Roger Jayson M. Mendez III
 * Began: 4/29/22
 * Last Modified: 5/10/22
 * This program does a stone game that is played
 * between a user and the computer. A random amount of
 * stones between 20-30 is generated upon start. The user and
 * the computer are restricted to getting 1 - 3 stones and the 
 * player that picks up all the stones losses. Two methods must 
 * be employed for this program, one for determining if the player
 * input is valid, and one to handle the computers turn. 
 */
package Exercises.chapterSeven;

import java.util.Scanner;
import java.util.Random;

public class exerciseNine {
    /*
     * Method for handling user's turn by reducing
     * the stone count based on their input. If the 
     * stones reach 0, a defeat message will be printed
     * onto the terminal. This method will return
     * how many stones remain.
     * pre: none
     * post: Amount of stones remaining as int
     *       Defeat message if stones == 0
     */
    public static int startUserTurn(int stones, int get) {
        stones -= get;

        System.out.println("You take " + get + " stone(s)...");

        if (stones == 0) {
            System.out.println("You have lost. Better Luck next time.");
        }
        return stones;
    }

    /*
     * Method for handling computer's turn.
     * A random number between 1 - 3 is generated
     * if the remaining stones is greater than 3.
     * Otherwise, it will generate a number between
     * 1 to remaining stones instead. The randomized value is
     * used to reduce the remaining stone. If the amount of stones 
     * left is 0, a victory message is printed out. The method will
     * then return the remaining stones.
     * pre: none
     * post: Amount of stones remaining as int
     *       Victory message if stones == 0
     */
    public static int drawStones(int stones, Random rand) {
        int compTake;

        if (stones >= 3) {
            compTake = rand.nextInt(3) + 1;
            stones -= compTake;
        }
        else {
            compTake = rand.nextInt(stones) + 1;
            stones -= compTake;

        }

        System.out.println("Computer takes " + compTake + " stone(s)...");

        if (stones == 0) {
            System.out.println("You win!!!");
        }

        return stones;
    }

    /*
     * Method to verify input validity.
     * If there are greater than 3 stones, valid
     * range will be between 1 - 3. Otherwise the valid
     * range would be between 1 to how many stones remain.
     * This method returns a boolean value which denotes if the
     * entry is valid or not.
     * pre: none
     * post: true if input is valid
     *       false if input is invalid
     */
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
            do {
                System.out.println("\n" + stones + " stones remain...");
                System.out.print("Input amount to get (min 1, max 3): ");
                get = in.nextInt();
            } while( !(isValidEntry(stones, get)) );

            stones = startUserTurn(stones, get);

            if (stones > 0) {
                stones = drawStones(stones, rand);
            }
        }

        in.close();
    }
}
