package chapterEightExerciseEight;

import java.util.Scanner;

public class mains {
    public static void main(String[] args){

        int ans;
        int One;
        int Two;
        int correct;
        int score = 0;

        random r = new random();
        Scanner userIn = new Scanner(System.in);
        
        System.out.println("Hello, welcome to adder game.");

        do{
            System.out.println("Let's begin! ");
            One = r.Onez();
            Two = r.Twozz();
            correct = One + Two;
            System.out.println("What is " + One +  " + " + Two + " ? ");
            System.out.println("Enter your answer: ");
            ans = userIn.nextInt();
            //for (int x = 1; x < 3; x++){
                if(ans == 999){
                    
                }

                else if (ans == correct && ans != 999){
                    score += 5;
                    System.out.println("You have answered correctly! ");
                    //x = 3;
                }
                else if (ans > correct || ans < correct){
                    System.out.println("Wrong answer. Enter another answer: ");
                    ans = userIn.nextInt();

                    if(ans == correct && ans != 999){
                        System.out.println("You have answered correctly! ");  
                        score += 3;
                    }
                    else {
                        System.out.println("Wrong answer. Enter another answer: ");
                        ans = userIn.nextInt();

                        if(ans == correct && ans != 999){
                            System.out.println("You have answered correctly! ");  
                            score += 1;
                        }
                        else {
                            System.out.println("The correct answer is: " + correct);
                        }
                    }
                }
                  
            //}
        }
        while (ans != 999);
        userIn.close();
        System.out.println("Your score is: " + score);
    }
}
