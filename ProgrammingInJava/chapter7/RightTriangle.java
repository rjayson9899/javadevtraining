package ProgrammingInJava.chapter7;

public class RightTriangle{
    public static void drawBar(int length, String mark) {

        for (int i = 0; i < length; i++){
            System.out.print(mark);
        }
        System.out.println();        
    }

    public static void main(String[] args) {
        for (int i = 1; i < 6; i++){
            drawBar(6, "$");
        }
    }
}