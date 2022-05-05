package squares;

public class mains {
    public static void main(String[] args){
        int[] square = {0,1,2,3,4};

        for (int x = 0; x < 5; x++){
            square[x] *= square[x]; 
            System.out.println(square[x]);
        }
    }
}
