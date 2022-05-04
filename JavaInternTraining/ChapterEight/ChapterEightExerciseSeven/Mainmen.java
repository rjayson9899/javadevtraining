package ChapterEightExerciseSeven;

import java.util.Scanner;
public class Mainmen{
    static Scanner userIn = new Scanner(System.in);
    public static void main(String[] args){
        int choice;
        int pins;
        int bats,pinsleft;
        
        player pl = new player();
        Frames frames = new Frames(10 , 3, 2);
        scorer sc = new scorer(10);

        System.out.println("Please choose a number: ");
        System.out.println("1. Start ");
        System.out.println("2. Exit ");
        choice = userIn.nextInt();

        switch(choice){

            case 1:
            System.out.println("Let's start bowling!! ");
            for (int x = 0; x < frames.useframe(); x++){
                    for(int y = 0; y < frames.userthrowing(); y++){
                        
                        System.out.println("--------------------------------------------");
                        System.out.println("It's your turn to throw. ");
                        bats = pl.canThrow();
                        pins = sc.setPin();
                        pinsleft = pins - bats;

                        if( bats == pins ){

                            System.out.println("STRIKE!!!");
                            sc.setScore(20);
                            System.out.println(sc.getScore());
                            y++;

                        }
                        else{ 

                            System.out.println("You have hit " + bats + " pins out of " + pins + " pins. ");
                            System.out.println("It's your turn to throw. ");

                            bats = pl.canThrows(pinsleft);

                            pinsleft = pinsleft - bats;


                            if (pinsleft == 0){

                                System.out.println("You have hit " + bats + " pins out of " + pinsleft + " pins. ");
                                System.out.println("Nice Spare!");
                                sc.setScore(15);
                            }

                            else {

                                System.out.println("You have hit " + bats + " pins out of " + pins + " pins. ");
                                System.out.println("Awit sayo.");
                                sc.setScore(10 - pinsleft);
                            }

                            System.out.println("Your total score is: " + sc.getScore());
                        }
                    }
            }
            case 2:
            System.out.println("Thank you for using this application, goodbye!");
            userIn.close();
    }
    }
}
