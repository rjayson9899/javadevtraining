package ProgrammingInJava.chapter10;

public class Squares {
    public static void main(String[] args) {
        int [] num = {0, 1, 2, 3, 4};

        for(int x = 0; x < num.length; x++){
            System.out.println(num[x] + "\t" + (int)Math.pow(num[x],2));
        }
    }
}
