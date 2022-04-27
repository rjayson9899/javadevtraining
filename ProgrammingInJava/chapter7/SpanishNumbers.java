package ProgrammingInJava.chapter7;

public class SpanishNumbers{
    public static void displaySpanishNumbers(int nums) {
        String[] numbers = {"uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez"};
        System.out.println(numbers[nums]);
    }
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            displaySpanishNumbers(i);
        }
    }
}