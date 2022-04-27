package Exercises.chapterEight;

import java.util.Random;

public class BowlingGame {
    private int pins;
    private int chances;
    private int points;
    private boolean isReady;

    public BowlingGame() {
        pins = 0;
        chances = 0;
        points = 0;
        isReady = false;
    }

    public void startGame() {
        if (isReady) {
            System.out.println("\nGame is in progress, end current game first before starting another\n");
        }
        else {
            pins = 10;
            chances = 2;
            points = 0;
            isReady = true;
        }
    }

    public boolean doThrow() {
        Random rand = new Random();
        int hits;
        
        if (chances == 2) {
            hits = rand.nextInt(11);
            if (hits == 10) {
                System.out.println("Strike!!!");
                points = 20;
                pins = 0;
                chances = 0;
                return false;
            }
            else {
                System.out.println(hits + " pins have been hit");
                pins -= hits;
                chances--;
                return true;
            }
        }
        else if (chances == 1) {
            hits = rand.nextInt(pins + 1);
            if (hits == pins) {
                System.out.println("Spare!!!");
                pins = 0;
                points = 15;
            }
            else {
                System.out.println(hits + " pins have been hit");
                pins -= hits;
            }
            chances--;
            return false;
        }
        else {
            System.out.println("\nOut of chances, check out your points and start a new game\n");
            return false;
        }
    }

    public int getPoints() {
        if (isReady) {
            if (pins > 0) {
                points = 10 - pins;
                isReady = false;
                return points;
            }
            else {
                isReady = false;
                return points;
            }
        }
        else {
            System.out.println("No game in progress, please begin a round");
            return -1;
        }
    }
}
