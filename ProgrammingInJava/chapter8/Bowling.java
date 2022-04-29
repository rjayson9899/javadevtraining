package ProgrammingInJava.chapter8;

public class Bowling{
    int score;
    public static void main(String[] args) {
        BowlingGame game = new BowlingGame();
        BowlingPlayer player = new BowlingPlayer();

        System.out.println("Let's Start Bowling!");

        for (int x = 0; x < 10; x++){ //Frames
            System.out.println("Frame #" + (x+1));
            for (int y = 2; y > 0; y--){ //Chances
                game.startGame();
            }
            System.out.println("Your score is: " + game.getScore());
            game.resetGame();
        }
    }
}