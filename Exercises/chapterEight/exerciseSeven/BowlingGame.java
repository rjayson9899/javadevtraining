package Exercises.chapterEight.exerciseSeven;

import java.util.Random;

public class BowlingGame {
    private int pins;
    private int chances;
    private int points;
    private boolean isReady;

    public BowlingGame() {
        this.pins = 0;
        this.chances = 0;
        this.points = 0;
        this.isReady = false;
    }

    private boolean doThrowLogic() {
        Random rand = new Random();
        int hits;
        if (chances == 2) {
            hits = rand.nextInt(11);
            if (hits == 10) {
                System.out.println("Strike!!!");
                this.points = 20;
                this.pins = 0;
                this.chances = 0;
                return false;
            }
            else {
                System.out.println(hits + " pins have been hit");
                this.pins -= hits;
                this.chances--;
                return true;
            }
        }
        else if (chances == 1) {
            hits = rand.nextInt(pins + 1);
            if (hits == pins) {
                System.out.println("Spare!!!");
                this.pins = 0;
                this.points = 15;
            }
            else {
                System.out.println(hits + " pins have been hit");
                this.pins -= hits;
            }
            this.chances--;
            return false;
        }
        else {
            System.out.println("\nOut of chances, check out your points and start a new game\n");
            return false;
        }
    }

    public void startGame() {
        if (isReady) {
            System.out.println("\nGame is in progress, end current game first before starting another\n");
        }
        else {
            this.pins = 10;
            this.chances = 2;
            this.points = 0;
            this.isReady = true;
        }
    }

    public boolean doThrow() {
        if (isReady) {
            return doThrowLogic();
        }
        else {
            System.out.println("No game in progress, please begin a round");
            return false;
        } 
    }

    public int getPoints() {
        if (isReady) {
            if (pins > 0) {
                this.points = 10 - pins;
                this.isReady = false;
                return points;
            }
            else {
                this.isReady = false;
                return points;
            }
        }
        else {
            System.out.println("No game in progress, please begin a round");
            return -1;
        }
    }
}
