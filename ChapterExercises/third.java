public class third {
    public static void main(String[] args){
     /*   System.out.println("***************");
        System.out.println("*             *");
        System.out.println("*             *");
        System.out.println("*             *");
        System.out.println("*             *");
        System.out.println("*             *");
        System.out.println("***************"); */

        for (int y=0; y<7; y++){        
            for (int x=0; x<15; x++){
                if ((y==0 || y==6) || (x==0 || x==14)){
                System.out.print("*");}
                else {System.out.print(" ");}
            }
            System.out.println();
        }
    }
}