package ProgrammingInJava.chapter8;

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

    public void startGame() {
        int pinHits;

        Random rand = new Random();

        if (throwBall == 2) {
            pinHits = rand.nextInt(11);
            if (pinHits == 10){
                System.out.println("Strike!");
                this.score = 20;
                this.bowlingPins = 0;
                this.throwBall = 0;
            } else {
                System.out.println("You've hit a total of " + pinHits + "pins");
                this.bowlingPins = pinHits;
                this.throwBall = 1;
                this.score = 10 - pinHits;
            }
                System.out.println(this.score);
        }
        else if (throwBall == 1){
            pinHits = rand.nextInt(11);
            if (pinHits == 10){
                System.out.println("Spare!");
                this.score = 15;
                this.bowlingPins = 0;
                this.throwBall = 0;
            } else {
                System.out.println("You've hit a total of " + pinHits + "pins");
                this.bowlingPins = pinHits;
                this.throwBall = 0;
                this.score = 10 - pinHits;
            }
        }   
    }

    public int getScore(){
        return(this.score);
    }
}