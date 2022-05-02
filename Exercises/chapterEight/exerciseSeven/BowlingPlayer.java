package Exercises.chapterEight.exerciseSeven;

public class BowlingPlayer {
    private String name;
    private int[] score = new int[10];

    public BowlingPlayer(String name) {
        for (int i = 0; i < 10; i++) {
            this.score[i] = 0;
        }
        this.name = name;
    }
    
    public int startTurn(BowlingGame game, int frame) {
        int points;

        game.startGame();
        while (game.doThrow());
        points = game.getPoints();
        this.score[frame] = points;

        return points;
    }

    public String getName() {
        return this.name;
    }

    public int getPoints(int frame) {
        return this.score[frame];
    }

    public int getTotal() {
        int total = 0;

        for (int i = 0; i < 10; i++) {
            total += this.score[i];
        }

        return total;
    }
}
