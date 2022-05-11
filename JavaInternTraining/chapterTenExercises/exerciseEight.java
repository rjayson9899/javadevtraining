package chapterTenExercises;

import java.util.Scanner;
public class exerciseEight {
    public static void main(String[] args){
        String inn;
        Scanner userIn = new Scanner(System.in);
        char[] con;
        System.out.println("Enter a word: ");

        inn = userIn.nextLine();
        inn = inn.replaceAll(" ", "");
        con = inn.toCharArray();
        int y = con.length-1;
        int ef = con.length/2;

        if (con.length % 2 != 0){
            for (int x = 0; x < ef; x++){

                if (con[x] == con[y]){
                    y--;
                }
                else {
                    System.out.println("The word is not a palidrome. ");
                }
            }
        }
        else {
            for (int x = 0; x < ef; x++){

                if (con[x] == con[y]){
                    y--;
                    if (x == y){
                        System.out.println("word is a palidrome.");
                    }
                }
                else {
                    System.out.println("The word is not a palidrome. ");
                }
            }

        }
         System.out.println("word is a palidrome.");
        userIn.close();
    }
}
