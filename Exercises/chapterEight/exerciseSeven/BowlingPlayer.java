/*
 * Made by: Roger Jayson M. Mendez III
 * Began: 4/27/22
 * Last Modified: 5/04/22
 * This exercises focuses on creating a bowling app that meets specifications listed in 
 * Ch. 8, pg. 212. To achieve the specifications, three classes were designed, one to
 * represent the game, one to represent the player, and one to handle the flow of everything.
 * This file represents an individual player. Each instance has their own name and score array.
 * Methods here are made available to make it easier to track individual scores. This object is
 * designed to be able to interact with an instance of BowlingGame for more efficient memory 
 * manangement.
 */
package Exercises.chapterEight.exerciseSeven;

public class BowlingPlayer {
    private String name;
    private int[] score = new int[10];

    /*
     * Instantiates a player and assigns it a name based
     * on provided parameter.
     * pre: none
     * post: Player instance with name
     */
    public BowlingPlayer(String name) {
        this.name = name;
    }
    
    /*
     * Handles the process of starting a game, throwing, and obtaining score
     * from a BowlingGame instance. Requires a frame parameter to track where 
     * the score will be stored at.
     * pre: none
     * post: 
     */
    public int startTurn(BowlingGame game, int frame) {
        int points;

        game.startGame();
        while (game.doThrow());
        points = game.getPoints();
        this.score[frame] = points;

        return points;
    }

    /*
     * Returns the assigned name of the player
     * pre: none
     * post: player name as string
     */
    public String getName() {
        return this.name;
    }

    /*
     * Returns the amount of points the player got at
     * a particular frame.
     * pre: none
     * post: frame score as int
     */
    public int getPoints(int frame) {
        return this.score[frame];
    }

    /*
     * Sums all of the scores of the player
     * and returns the value
     * pre: none
     * post: cumulative score as int
     */
    public int getTotal() {
        int total = 0;

        for (int i = 0; i < 10; i++) {
            total += this.score[i];
        }

        return total;
    }
}


