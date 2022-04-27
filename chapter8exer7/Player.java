package chapter8exer7;

public class Player {
    
    private String name;
    private int score;

    public Player(String name){
        this.name = name;
    }

    public void setScore(int scoring){
        this.score += scoring;
    }

    public int getScore(){
        return score;
    }

    public String getName(){
        return name;
    }
}
