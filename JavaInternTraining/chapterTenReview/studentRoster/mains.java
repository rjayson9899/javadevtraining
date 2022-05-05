package studentRoster;

import java.util.Scanner;

public class mains {
    public static void main(String[] args){
        String[] names;
        int numb;

        Scanner userIn = new Scanner(System.in);

        System.out.println("Enter how many students: ");
        numb = userIn.nextInt();
        names = new String[numb];
        userIn.nextLine();
        for (int x = 0; x < numb; x++){
            System.out.println("Enter the student name: ");
            names[x] = userIn.nextLine();
        }

        userIn.nextLine();
        System.out.println("Student roster: ");
        for (int x = 0; x < numb; x++){
            System.out.println(names[x]);
        }
        userIn.close();
    }
}
