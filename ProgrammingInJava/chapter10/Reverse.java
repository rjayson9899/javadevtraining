package ProgrammingInJava.chapter10;

public class Reverse {
    public static void main(String[] args) {
        int [] num = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        System.out.println("Countdown");
        for(int x = 9; x >= 0; x--){
            System.out.println(num[x]);
        }
    }
}
