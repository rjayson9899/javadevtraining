package Exercises.chapterEight;

import java.util.Scanner;

public class Bowling {
    public static void main(String[] args) {
        BowlingGame game = new BowlingGame();
        Scanner in = new Scanner(System.in);
        int[] score = new int[10];
        int total = 0;

        System.out.println("Welcome to bowling game");

        for (int i = 0; i < 10; i++) {
            int points;
            System.out.println("\nFrame " + (i + 1));
            game.startGame();
            do {
                System.out.print("Press enter to throw...");
                in.nextLine();
            } while (game.doThrow());
            points = game.getPoints();
            System.out.println("Points for the current frame: " + points);
            score[i] = points;
        }

        System.out.println("Points for each round");
        for (int i = 0; i < 10; i++) {
            System.out.println("Frame " + (i+1) + ": " + score[i]);
            total += score[i];
        }
        System.out.println("For a grand total of: " + total);

        in.close();
    }

    
}
