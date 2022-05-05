package reverse;

public class mains {
    public static void main(String[] args){
        int[] names = new int[10];
        System.out.println("Countdown begin! ");
        for(int x = 9; x >= 0; x--){
            names[x] = x;
            System.out.println(names[x]);
        }
    }
}
