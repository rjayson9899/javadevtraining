package ProgrammingInJava.chapter8.exercise7;

import java.util.Random;

public class BowlingGame{
    private int bowlingPins;
    private int score;
    private int throwBall;

    public BowlingGame() {
        this.bowlingPins = 10;
        this.score = 0;
        this.throwBall = 2;
    }

    public void resetGame(){
        this.bowlingPins = 10;
        this.score = 0;
        this.throwBall = 2;
    }

    public int startGame() {
        int pinHits;
        
        Random rand = new Random();

        if (this.throwBall == 2) {
            pinHits = rand.nextInt(11);
            if (pinHits == 10){
                System.out.println("Strike!");
                this.score = 20;
                this.bowlingPins = 0;
                this.throwBall = 0;
            } else {
                System.out.println("You've hit a total of " + pinHits + "pins");
                this.bowlingPins = 10 - pinHits;
                this.throwBall = 1;
                this.score = pinHits;
            }

            return this.score;
        }
        else if (this.throwBall == 1){
            pinHits = rand.nextInt(bowlingPins + 1);
            if (pinHits == bowlingPins){
                System.out.println("Spare!");
                this.score = 15;
                this.bowlingPins = 0;
                this.throwBall = 0;
            } else {
                System.out.println("You've hit a total of " + pinHits + "pins");
                this.bowlingPins = pinHits;
                this.throwBall = 0;
                this.score += pinHits;
            }
            return this.score;
        }
        else {
            return -1;
        }               
    }

    public int getScore(){
        return(this.score);
    }
}