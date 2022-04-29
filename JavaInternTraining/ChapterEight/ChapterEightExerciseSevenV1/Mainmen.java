package ChapterEight.ChapterEightExerciseSevenV1;

import java.util.ArrayList;
import java.util.Scanner;
public class Mainmen{
    static Scanner userIn = new Scanner(System.in);
    public static void main(String[] args){
        int choice;
        int numplay,pins;
        int bats,pinsleft;
        ArrayList<player> playname = new ArrayList<>();
        String names;
        

        Frames frames = new Frames(10 , 3, 2);
        scorer sc = new scorer(10);

        System.out.println("Please choose a number: ");
        System.out.println("1. Start ");
        System.out.println("2. Exit ");
        choice = userIn.nextInt();

        switch(choice){

            case 1:
            System.out.println(" how many players?: ");
            numplay = userIn.nextInt();
            userIn.nextLine();
            for (int x = 0; x < numplay; x++){
            System.out.println(" Enter player name: ");
            names = userIn.nextLine();
            playname.add(new player(names, 0));
          }
            System.out.println("Let's start bowling!! ");
            for (int x = 0; x < frames.useframe(); x++){
                for(int z = 0; z < numplay; z++){
                    for(int y = 0; y < frames.userthrowing(); y++){
                        
                        System.out.println("--------------------------------------------");
                        System.out.println("It's " + playname.get(y).getName() +" turn to throw. ");
                        bats = playname.get(y).canThrow();
                        pins = sc.setPin();
                        pinsleft = pins - bats;

                        if( bats == pins ){

                            System.out.println("STRIKE!!!");
                            playname.get(y).setScore(20);
                            System.out.println( playname.get(y).getScore());
                            y++;

                        }
                        else{ 

                            System.out.println(playname.get(y).getName() + " have hit " + bats + " pins out of " + pins + " pins. ");
                            System.out.println("It's your turn to throw. ");

                            bats = playname.get(y).canThrows(pinsleft);

                            pinsleft = pinsleft - bats;


                            if (pinsleft == 0){

                                System.out.println(playname.get(y).getName() + " have hit " + bats + " pins out of " + pinsleft + " pins. ");
                                System.out.println("Nice Spare!");
                                playname.get(y).setScore(15);
                            }

                            else {

                                System.out.println(playname.get(y).getName() + " have hit " + bats + " pins out of " + pins + " pins. ");
                                System.out.println("Awit sayo.");
                                playname.get(y).setScore(10 - pinsleft);
                            }

                            System.out.println(playname.get(y).getName() + "'s' total score is: " +  playname.get(y).getScore());
                        }
                    }
                
                }

            }
           /* System.out.println("Its your turn to throw. ");
           System.out.println(" how many players?: ");
            numplay = userIn.nextInt();
            for(int x = 1; x <= 10; x++){
                for (int y = 1; y <= numplay; y++){
                    System.out.println("player 1");
                }
                System.out.println("player 2");
            } */

            case 2:
            System.out.println("Thank you for using this application, goodbye!");
        userIn.close();
    }
    }
}
