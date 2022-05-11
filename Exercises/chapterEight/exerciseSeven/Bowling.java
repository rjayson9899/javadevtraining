/*
 * Made by: Roger Jayson M. Mendez III
 * Began: 4/27/22
 * Last Modified: 5/04/22
 * This exercises focuses on creating a bowling app that meets specifications listed in 
 * Ch. 8, pg. 212. To achieve the specifications, three classes were designed, one to
 * represent the game, one to represent the player, and one to handle the flow of everything.
 * This file serves as the client code and the one that handles the flow of everything. 
 * The program is capable of instantiating up to 4 different player objects that will interact
 * with a singular bowling game object. This program will handle turns, frames, 
 * and outputting of scores to the terminal.
 */
package Exercises.chapterEight.exerciseSeven;

import java.util.Scanner;

public class Bowling {
    public static void main(String[] args) {
        BowlingGame game = new BowlingGame();
        Scanner in = new Scanner(System.in);
        int playerCount;

        System.out.println("Welcome to bowling game");

        do {
            System.out.print("Input amount of players (max 4, min 1): ");
            playerCount = in.nextInt();
            if (playerCount > 4 || playerCount < 1) {
                System.out.println("Invalid amount of players, input again");
            }
        } while(playerCount > 4 || playerCount < 1);
        in.nextLine();

        BowlingPlayer[] players = new BowlingPlayer[playerCount];
        for (int i = 0; i < playerCount; i++) {
            System.out.print("Input name of player " + (i + 1) + ": ");
            players[i] = new BowlingPlayer(in.nextLine());
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("\nFrame " + (i + 1));
            for (int j = 0; j < playerCount; j++) {
                int points;
                System.out.println("Current turn: " + players[j].getName());
                System.out.print("Press enter to begin round...");
                in.nextLine();
                points = players[j].startTurn(game, i);
                System.out.println("Points for " + players[j].getName() + ": " + points + "\n");
            }
        }
        
        System.out.println("\n\nPoints for each round");
        for (int i = 0; i < 10; i++) {
            System.out.println("Frame " + (i+1) + ": ");
            for (int j = 0; j < playerCount; j++) {
                System.out.println("\t" + players[j].getName() + ": " + players[j].getPoints(i));
            }
            System.out.println();
        }

        System.out.println("For a grand total of: ");
        for (int j = 0; j < playerCount; j++) {
            System.out.println("\t" + players[j].getName() + ": " + players[j].getTotal());
        }
        
        in.close();
    }
}
