package chapterEightExerciseEightV1;

import java.util.Random;

public class random {
    private int Onezzz;
    private int Twozzz;
    private int correctzzz;
    private int finalscore = 0;
    private int score = 5;

    static Random r = new Random();

    public random(){

    }

    public int Onez(){
        Onezzz = r.nextInt(20 - 0 + 0) + 0;
        return Onezzz;
    }

    public int Twozz(){
        Twozzz = r.nextInt(20 - 0 + 0) + 0;
        return Twozzz;
    }

    public int correctzz(){
        correctzzz = Onezzz + Twozzz;
        return correctzzz;
    }

    public int setscore(int score){
        finalscore += score;
        return finalscore;
    }

    public int getscore(){
        return finalscore;
    }

    public int resetscore(){
        this.score = 5;
        return score;
    }

    public int tempscore(){                
        score -= 2; 
        return score;
    }
}
