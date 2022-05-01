package ProgrammingInJava.chapter8;

public class BowlingPlayer {
    private int totalScore;
    private String name;

    public BowlingPlayer(String name){
        this.totalScore = 0;
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return(this.name);
    }

    public void addScore(BowlingGame game){
        this.totalScore += game.getScore();
    }

    public int getTotalScore(){
        return(this.totalScore);
    }
}