package ProgrammingInJava.chapter8;

import java.util.Random;

public class AdderRandom {
    private int score;
    private int chance;
    private int num1;
    private int num2;
    private int sum;
    private int totalscore;

    public AdderRandom(){
        this.score = 0;
        this.chance = 3;
    }

    public void newGame(){
        Random rand = new Random();
        this.num1 = rand.nextInt(21);
        this.num2 = rand.nextInt(21);
        this.chance = 3;
        this.sum = num1 + num2;
    }

    public int startGame(int input){
        if(input == 999){
            this.score = 0;
            return(999);
        }
        if(this.chance == 3){
            if(input == sum){
                this.score = 5;
                return(this.score);
            }else {
                System.out.println("Wrong answer. Enter another answer. ");
                this.chance --;
                return -1;
            }
        }else if (this.chance == 2){
            if(input == sum){
                this.score = 3;
                return(this.score);
            }else {
                System.out.println("Wrong answer. Enter another answer. ");
                this.chance --;
                return -1;
            }
        }else if (this.chance == 1){
            if(input == sum){
                this.score = 1;
                return(this.score);
            }else {
                System.out.println("Wrong answer. The correct answer is: " + sum);
                return(0);
            }
        }
        return -1;
    }

    public void printQuestion(){
        System.out.print("What is " + this.num1 + " + " + this.num2 + " = ");
    }

    public int getScore(){
        return(this.totalscore);
    }

    public void addScore(){
        this.totalscore += this.score;
    }
}
