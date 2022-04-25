package ProgrammingInJava.chapter4;

/*
A program that Displays Election Results
Made by: Edmark Aldea

Chapter 4 Execise 16
*/
import java.util.Scanner;
import java.text.NumberFormat;

public class Election{
    public static void voteWisely() {
        String cand1, cand2;
        int vote1, vote2, totalvote;
        double perc1, perc2;
        NumberFormat percent = NumberFormat.getPercentInstance();
        percent.setMinimumFractionDigits(2);
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the first Candidate: ");
        cand1 = input.next();
        System.out.println("Enter the number of Votes: ");
        vote1 = input.nextInt();
        System.out.println("Enter the second Candidate: ");
        cand2 = input.next();
        System.out.println("Enter the number of Votes: ");
        vote2 = input.nextInt();
        input.close();

        totalvote = vote1 + vote2;
        perc1 = ((double)vote1 / (double)totalvote);
        perc2 = ((double)vote2 / (double)totalvote); 

        System.out.println(totalvote + " " + perc1 + " "  + perc2);
        System.out.println("Voting Results");
        System.out.format("%10s %10s %10s \n", "Candidate", "Votes", "Percentage");
        System.out.format("%-10s %10s %10s \n", cand1, vote1, percent.format(perc1));
        System.out.format("%-10s %10s %10s \n", cand2, vote2, percent.format(perc2));
        System.out.println("Total Votes are: " + totalvote);
    }

    public static void main(String[] args) {
        voteWisely();
    }
}