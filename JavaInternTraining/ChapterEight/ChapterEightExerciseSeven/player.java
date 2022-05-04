package ChapterEightExerciseSeven;

import java.util.Random;

public class player {

static int throwAb;

static Random Bato = new Random(); 

    public player(){

    }

    public int canThrow(){

      throwAb = Bato.nextInt(10 - 0 + 1) + 0;

        return throwAb;
    }

    public int canThrows(int pinsleft){
        
        throwAb = Bato.nextInt(pinsleft + 1);

        return throwAb;
    }


}