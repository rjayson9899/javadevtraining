package ProgrammingInJava.chapter3;

public class Rectangle{
    public static void main(String[] args) {
        for (int x = 0; x < 14; x++) System.out.print("*");
        System.out.format("\n%-2s %11s", "*","*");
        System.out.format("\n%-2s %11s", "*","*");
        System.out.format("\n%-2s %11s", "*","*");
        System.out.format("\n%-2s %11s", "*","*");
        System.out.print("\n");
        for (int x = 0; x < 14; x++) System.out.print("*");       
    }
}