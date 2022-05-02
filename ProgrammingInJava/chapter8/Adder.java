package ProgrammingInJava.chapter8;

import java.util.Scanner;

public class Adder {
    public static void main(String[] args) {
        final int SENTINEL = 999;

        AdderRandom game = new AdderRandom();
        Scanner sc = new Scanner(System.in);
        int control = 0;
        
        do {
            game.newGame();
            do{
                game.printQuestion();
                control = game.startGame(sc.nextInt());
            } while( control < 0 && control != SENTINEL);
            game.addScore();
            System.out.println("Your score is: " + game.getScore());
        } while(control != SENTINEL);
        sc.close();
    }
}
