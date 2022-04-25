package chapter3exer;

public class exer3 {
    public static void main(String[] args) {
        int columns = 7, rows = 15;


        for(int x = 0; x < columns; x++ ){
            for(int y = 0; y < rows; y++){
                if(x==0 || x == columns - 1){
                    System.out.print("*");
                }

                else if(y == 0 || y == rows - 1){
                    System.out.print("*");
                }

                else{
                    System.out.print(" ");
                }


            }
            System.out.println("");

        }

    }
}
