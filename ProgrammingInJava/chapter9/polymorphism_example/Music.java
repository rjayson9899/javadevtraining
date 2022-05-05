package ProgrammingInJava.chapter9.polymorphism_example;

import java.util.Scanner;

public class Music {
    public static Instrument assignInstrument(){
        String instrumentChoice;
        Scanner input = new Scanner(System.in);
        String name;

        System.out.println("Select an instrument for the band member: ");
        System.out.print("Vocals (V), Piccolo(P), or Clarinet(C): ");
        instrumentChoice = input.nextLine();
        System.out.print("Enter the band member's name: ");
        name = input.nextLine();
        if (instrumentChoice.equalsIgnoreCase("V")){
            return (new Vocal(name));
        } else if (instrumentChoice.equalsIgnoreCase("P")){
            return (new Piccolo(name));
        } else {
            return (new Clarinet(name));
        }
    }
    public static void main(String[] args) {
        Performance band;
        Instrument bandMember1, bandMember2, bandMember3;
        Scanner input = new Scanner(System.in);
        String performanceChoice;

        /* assign Instruments*/
        bandMember1 = assignInstrument();
        bandMember2 = assignInstrument();
        bandMember3 = assignInstrument();
        System.out.println(bandMember1 + " " + bandMember2 + " " + bandMember3 + "\n");
        System.out.print("Would you like to hear a Solo(S), a Duet(D), a Trio(T), or Leave(L)? ");
        performanceChoice = input.nextLine();
        while (!performanceChoice.equalsIgnoreCase("L")) {
            if (performanceChoice.equalsIgnoreCase("S")) {
                band = new Performance(bandMember1);
            } else if (performanceChoice.equalsIgnoreCase("D")){
                band = new Performance(bandMember1, bandMember2);
            } else { //default trio
                band = new Performance(bandMember1, bandMember2, bandMember3);
            }
            band.begin();

            System.out.print("\n Would you like to hear a Solo(S), a Duet(D), a Trio(T), or Leave(L)? ");;
            performanceChoice = input.nextLine();

        }
        input.close();
    } 
}
