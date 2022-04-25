package ProgrammingInJava.chapter6;

public class Evens{
    public static void main(String[] args) {
        int limit = 20;
        int i = 0;
        
        System.out.print("Even numbers from 1 to 20 are:");

        while(i < limit){
            i = i + 2;
            System.out.print(" " + i);
        }
    }
}