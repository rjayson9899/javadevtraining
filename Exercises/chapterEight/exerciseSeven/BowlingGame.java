/*
 * Made by: Roger Jayson M. Mendez III
 * Began: 4/27/22
 * Last Modified: 5/04/22
 * This exercises focuses on creating a bowling app that meets specifications listed in 
 * Ch. 8, pg. 212. To achieve the specifications, three classes were designed, one to
 * represent the game, one to represent the player, and one to handle the flow of everything.
 * This file represent the game itself. Think of it as the logic that a bowling alley 
 * employs at specific moments in a game. To easily replicate the behavior of a bowling alley,
 * key characteristics must be defined. These characteristics are the pins currently in the 
 * lane, the amount of chances the player has left, the amount of points accumulated so far,
 * and whether the lane is ready for the player to bowl or not. Three critical steps of a
 * bowling game were implemented in this program which are the ability to prep the lane, the
 * ability to determine how many hits a player got, and the ability for a lane to clean itself
 * up once a round is done. More details on these steps can be found in their respective 
 * method documentation.
 */
package Exercises.chapterEight.exerciseSeven;

import java.util.Random;

public class BowlingGame {
    private int pins;
    private int chances;
    private int points;
    private boolean isReady;

    /*
     * Instantiates a bowling game instance that
     * is not yet prepped for playing
     * pre: none
     * post: unready BowlingGame instance 
     */
    public BowlingGame() {
        this.pins = 0;
        this.chances = 0;
        this.points = 0;
        this.isReady = false;
    }

    /*
     * Handles hit and points logic. To do a throw, a chance must be 
     * available and will decrement for each throw. There can only be 
     * a maximum of 2 chances per new game. In every throw, a random
     * number is generated between 0 to the remaining pins to determine
     * how many pins are hit. For as long as there are pins remaining, 
     * The points of the player will always be based on how many pins are 
     * hit. If the amount of hits match the amount of pins, a specific
     * amount of points is awarded instead depending on the circumstance:
     *      if there are 2 chances left, points = 20
     *      if there is 1 chance left, points = 15
     * 
     * After a throw, a boolean value is returned. This boolean value represents
     * if there is still a chance for the player to throw. A more detailed
     * explanation on the conditions on what value is returned can be found on
     * the postcondition portion of this documentation.
     * pre: none
     * post: true  - if there are still 2 chances and hits < pins
     *       false - if chances remaining is less than 2
     *             - if hits == pins when chances == 2
     */
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

    /*
     * Sets up the alley for a new game.
     * A new game can only be started when
     * the lane is not yet ready.
     * pre: isReady == false
     * post: Sets pins to 10
     *       Set chances to 2
     *       Resets points to 0
     *       Raise ready flag to true
     */
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

    /*
     * Gatekeeping logic to prevent throwing unless a game is ready.
     * Returns doThrowLogic() value if a game is ready. Returns a false
     * if the game is not yet ready.
     * pre: none
     * post: doThrowLogic() if isReady == true
     *       false if irRead == false
     */
    public boolean doThrow() {
        if (isReady) {
            return doThrowLogic();
        }
        else {
            System.out.println("No game in progress, please begin a round");
            return false;
        } 
    }

    /*
     * Returns the amount of points gained so far. Sets the
     * lane as not ready afterwards. If no game is in progress, a -1
     * is returned instead.
     * pre: none
     * post: points as integer
     *       -1 if isReady == false
     */
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
