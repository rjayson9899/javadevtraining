package ProgrammingInJava.chapter8;

public class Coin{
    private int faceUp;

    public Coin(){
        faceUp = 0;
    }

    public int showFace(){
        return(faceUp);
    }

    public int flipCoin(){
        faceUp = (int)(Math.random() * 2); 
        return(faceUp);
    }

    public static void main(String[] args) {
        Coin nickel = new Coin();
        
        if (nickel.flipCoin() == 0) {
            System.out.println("Heads up!");
        } else {
            System.out.println("Tails up!");
        }
    }
}