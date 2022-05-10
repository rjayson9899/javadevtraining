/*
* Made by: Roger Jayson M. Mendez III
* 4/19/22
* This program contains my answers to the exercises located in
* Chapter 3 of the Java programming guide
*/
package Exercises.chapterThree;

public class ChapterThree {
    /*
     * Prints a BINGO card with fixed values
     */
    public static void ExerciseOne () {
        System.out.format("%4s\t%4s\t%4s\t%4s\t%4s\n", "B", "I", "N", "G", "O");
        System.out.format("%4s\t%4s\t%4s\t%4s\t%4s\n", "13", "17", "42", "55", "72");
        System.out.format("%4s\t%4s\t%4s\t%4s\t%4s\n", "15", "30", "45", "60", "75");
        System.out.format("%4s\t%4s\t%4s\t%4s\t%4s\n", "7", "22", "FREE", "52", "63");
        System.out.format("%4s\t%4s\t%4s\t%4s\t%4s\n", "12", "27", "39", "49", "68");
        System.out.format("%4s\t%4s\t%4s\t%4s\t%4s\n", "1", "16", "31", "46", "61");
    }

    /*
     * Prints a list of instructions on how
     * to play BINGO
     */
    public static void ExerciseTwo () {
        System.out.println("Bingo Card\n");
        System.out.println("1. The caller randomly pulls a numbered bingo ball.\n");
        System.out.println("2. The number is placed on the bingo board and called out.\n");
        System.out.println("3. Players look for the called number of their bingo card.\n");
        System.out.println("4. If the number is located, it is marked off.\n");
        System.out.println("5. Steps 1 to 4 are repeated until a player matches the BINGO pattern.\n");
        System.out.println("6. The winning  player yells BINGO.");
    }
    
    /*
     * Prints a 15:7 rectangle's perimeter 
     */
    public static void ExerciseThree () {
        for (int y = 0; y < 7; y++) {
            for (int x = 0; x < 15; x++) {
                if ((y==0 || y==6) || (x==0 || x==14)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    /*
     * Prints instructions on how to play Rock, Paper, Scissors
     */
    public static void exerciseFour () {
        System.out.println("Rock Paper Scissors Rules\n");
        System.out.println("Players decide on different hand signals to represent rock, paper, and scissors\n");
        System.out.println("Players make a throw at the same time\n");
        System.out.println("The hand signals thrown by the players are then compared to the rules of the game to determine the winner:\n");
        System.out.println("\tRock dulls Scissors <Rock wins>.\n");
        System.out.println("\tScissors cut Paper <Scissors wins>.\n");
        System.out.println("\tPaper covers Rock <Paper wins>.\n");
    }

    /*
     * Prints a Tic Tac Toe Board with and X at the center
     */
    public static void exerciseFive () {
        for (int i = 0; i < 11; i++) {
            if (i==3 || i==7) System.out.println("---------------------");
            else if (i==5) System.out.println("      |   X   |      ");
            else System.out.println("      |       |      ");
        }
    }

    /*
     * Prints the rules of how to play
     * Tic Tac Toe
     */
    public static void exerciseSix () {
        System.out.println("Tic Tac Toe Rules\n");
        System.out.println("Tic Tac Toe is a game for 2 players.\n");
        System.out.println("1. A grid of 9 squares is drawn.\n");
        System.out.println("2. The first player draws an X in an empty square.\n");
        System.out.println("3. The second player draws an O in an empty square.\n");
        System.out.println("4. Steps 2 and 3 are repeated until a Tic Tac Pattern is created:\n");
        System.out.println("\tPatterns can be diagonal, horizontal, or vertical.\n");
        System.out.println("5. A winning pattern is completed by drawing a line through the pattern.");
    }
    
    /*
     * Prints a face
     */
    public static void printFace () {
        System.out.println("     *****");
        System.out.println("    *     *");
        System.out.println("   * _   _ *");
        System.out.println("  *  o   0  *");
        System.out.println(" *     |     *");
        System.out.println(" *     +    *");
        System.out.println("  *  \\___/ *");
        System.out.println("    *     *");
        System.out.println("     *****");
    }

    public static void main(String[] args) {
        printFace();
    }
}
