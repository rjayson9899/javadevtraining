package ProgrammingInJava.chapter8.OOD_Example;

public class Player {
    private double spendingMoney;
    private String prizesWon;

    public Player(double money) {
        spendingMoney = money;
        prizesWon = "";
    }

    public String play(GameBooth game) {
        String newPrize;

        if (game.getCost() > spendingMoney){
            return("Sorry, not enough money to play");
        } else {
            spendingMoney -= game.getCost();
            newPrize = game.start();
            prizesWon = newPrize + ", " + prizesWon;
            return("prize won: " + newPrize);
        }
    }

    public String showPrizes() {
        return(prizesWon);
    }
}