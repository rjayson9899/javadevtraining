package ProgrammingInJava.chapter8;

import java.util.Scanner;

public class Bowling{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BowlingGame game = new BowlingGame();
        BowlingPlayer player1 = new BowlingPlayer("");
        BowlingPlayer player2 = new BowlingPlayer("");
        int playerCount;

        System.out.println("Let's Start Bowling!");
        do {
            System.out.print("(1 or 2 Players only) Enter amount of players: ");
            playerCount = sc.nextInt();
            sc.nextLine();
            if (playerCount > 2 || playerCount < 1){
                System.out.println("Wrong input!");
            }
        } while(playerCount > 2 || playerCount < 1);
        
        System.out.println("Enter the name of Player 1: ");
        player1.setName(sc.nextLine());

        if(playerCount == 2){
            System.out.println("Enter the name of Player 2: ");
            player2.setName(sc.nextLine());
        }
        sc.close();

        for (int x = 0; x < 10; x++){ //Frames
            System.out.println("\nFrame #" + (x+1));
            for (int y = 0; y < playerCount; y++){ //Players
                if (y == 0){
                    System.out.println(player1.getName());
                    while(game.startGame() >= 0); // Throws
                    player1.addScore(game);
                    System.out.println(player1.getName() + " total score is: " + player1.getTotalScore());
                } else {
                    System.out.println(player2.getName());
                    while(game.startGame() >= 0);
                    player2.addScore(game);
                    System.out.println(player2.getName() + " total score is: " + player2.getTotalScore());
                }
                game.resetGame();
            }
        }
    }
}
