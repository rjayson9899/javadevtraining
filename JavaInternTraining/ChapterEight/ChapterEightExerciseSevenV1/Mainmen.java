package ChapterEightExerciseSevenV1;

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
        
        Frames frames = new Frames(10);
        scorer sc = new scorer(10);

        System.out.println("Please choose a number: ");
        System.out.println("1. Start ");
        System.out.println("2. Exit ");
        choice = userIn.nextInt();

        switch(choice){

            case 1:
            System.out.println("How many players?: ");
            numplay = userIn.nextInt();
            userIn.nextLine();
            for (int x = 0; x < numplay; x++){
            System.out.println("Enter player name: ");
            names = userIn.nextLine();
            playname.add(new player(names, 0));
          }
            System.out.println("Let's start bowling!! ");
            for (int x = 1; x <= frames.useframe(); x++){
                System.out.println("Frame: " + x);
                System.out.println("--------------------------------------------");
                for(int z = 0; z < numplay; z++){

                        System.out.println("--------------------------------------------");
                        System.out.println("It's " + playname.get(z).getName() +" turn to throw. ");
                        bats = playname.get(z).canThrow();
                        pins = sc.setPin();
                        pinsleft = pins - bats;

                        if( bats == pins ){

                            System.out.println("STRIKE!!!");
                            playname.get(z).setScore(20);
                            System.out.println(playname.get(z).getScore());
                            z++;

                        }
                        else{ 

                            System.out.println(playname.get(z).getName() + " have hit " + bats + " pins out of " + pins + " pins. ");
                            System.out.println("It's your turn to throw. ");

                            bats = playname.get(z).canThrows(pinsleft);

                            pinsleft = pinsleft - bats;


                            if (pinsleft == 0){

                                System.out.println(playname.get(z).getName() + " have hit " + bats + " pins out of " + pinsleft + " pins. ");
                                System.out.println("Nice Spare!");
                                playname.get(z).setScore(15);
                            }

                            else {

                                System.out.println(playname.get(z).getName() + " have hit " + bats + " pins out of " + pins + " pins. ");
                                System.out.println("Awit sayo.");
                                playname.get(z).setScore(10 - pinsleft);
                            }

                            System.out.println(playname.get(z).getName() + "'s' total score is: " +  playname.get(z).getScore());
                            System.out.println("--------------------------------------------");
                        }
                
                }

            }
            case 2:
            System.out.println("Thank you for using this application, goodbye!");
            userIn.close();
            break;
    }
    }
}
