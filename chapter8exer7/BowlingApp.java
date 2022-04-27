package chapter8exer7;

import java.util.ArrayList;
import java.util.Scanner;

public class BowlingApp {
    public static void main(String[] args) {
        //Initialization
        Scanner input = new Scanner(System.in);
        int numPlayers, scoring;
        String inputName;
        ArrayList<BowlGame> players = new ArrayList<>();

        System.out.print("Input number of players playing: ");
        
        numPlayers = input.nextInt();
        input.nextLine();

        for(int x = 0; x < numPlayers; x++){
            System.out.print("Input player " + (x + 1) + ": ");
            inputName = input.nextLine();
            players.add(new BowlGame(inputName));
            players.get(x).setScore(0);
        }

        for(int x = 0; x < 10; x++){
            for(int y = 0; y < numPlayers; y++){
                scoring = players.get(y).startFrame();
                System.out.println("score of " + players.get(y).getName() + " is: " + scoring);
            }
        }

        input.close();

    }


    
}
