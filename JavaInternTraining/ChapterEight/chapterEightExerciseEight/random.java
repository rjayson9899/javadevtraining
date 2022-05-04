package chapterEightExerciseEight;

import java.util.Random;

public class random {
    private int Onezz;
    private int Twozz;

    static Random r = new Random();

    public random(){

    }

    public int Onez(){
        Onezz = r.nextInt(20 - 0 + 0) + 0;
        return Onezz;
    }

    public int Twozz(){
        Twozz = r.nextInt(20 - 0 + 0) + 0;
        return Twozz;
    }
}
