package ProgrammingInJava.chapter8;

public class BowlingPlayer {
    private int totalScore;
    private String name;

    public BowlingPlayer(){
        totalScore = 0;
        name = "";
    }

    public void Score(BowlingGame game){
        totalScore = (game.getScore());
    }

}