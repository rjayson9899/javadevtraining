package chapterEightExerciseEightV1;

import java.util.Scanner;

public class mains {
    public static void main(String[] args){

        int ans;
        int One;
        int Two;
        int correct;
        int score = 5;
        int finalscore;

        random r = new random();
        Scanner userIn = new Scanner(System.in);
        
        System.out.println("Hello, welcome to adder game.");
        System.out.println("Let's begin! ");
        One = r.Onez();
        Two = r.Twozz();
        correct = r.correctzz();

        do{
            System.out.println("What is " + One +  " + " + Two + " ? ");
            System.out.println("Enter your answer: ");
            ans = userIn.nextInt();

            if (ans == correct){
                System.out.println("You have answered correctly! ");
                r.setscore(score);
                One = r.Onez();
                Two = r.Twozz();
                correct = r.correctzz();
                r.resetscore();
            }
            else {
                score = r.tempscore();
                if(score < 1){
                    System.out.println("The correct answer is: " + correct);
                    One = r.Onez();
                    Two = r.Twozz();
                    correct = r.correctzz();
                    r.resetscore();
                }
            }
        }
        while (ans != 999);
        userIn.close();
        finalscore = r.getscore();
        System.out.println("Your score is: " + finalscore);
    }
}
