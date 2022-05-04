package ChapterEightExerciseSevenV1;

import java.util.Random;

public class player extends scorer {

private int throwAb;
private String name;

static Random Bato = new Random(); 

    public player(String name, int score){
        super(score);
        this.name = name;
    }

    public int canThrow(){

      throwAb = Bato.nextInt(10 - 0 + 1) + 0;

        return throwAb;
    }

    public int canThrows(int pinsleft){
        
        throwAb = Bato.nextInt(pinsleft + 1);

        return throwAb;
    }
    public String getName(){
        return name;
    }

}