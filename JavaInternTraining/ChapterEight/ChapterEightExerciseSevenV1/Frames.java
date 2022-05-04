package ChapterEightExerciseSevenV1;

public class Frames {

    int frame;
    int finalframe;
    int throwing;

    public Frames(int frame, int finalframe , int throwing ){
        this.frame = frame;
        this.finalframe = finalframe;
        this.throwing = throwing;
    }

    public int useframe(){
        return frame;
    } 

    public int usefinalframe(){
        return finalframe;
    }

    public int userthrowing(){
        return throwing;
    }
}
