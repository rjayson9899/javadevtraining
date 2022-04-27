public class ChapterThreeExercise {

    public static void runThird(){
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

    public static void runSecond() {
        System.out.println("Binary Card");
        System.out.println("1. The caller randomly pulls a numbered bingo card.");
        System.out.println("2. The number is placed on the bingo board and called out.");
        System.out.println("3. Players look for the called number on their bingo card.");
        System.out.println("4. If the number is located, it is marked off.");
        System.out.println("5. Steps 1 to 4 are repeated until a player matches the BINGO pattern.");
        System.out.println("6. The winning player yells BINGO.");
     }
    public static void main(String[] args) {
        System.out.format("%8s %8s %8s %8s %8s", "B", "I", "N", "G", "O\n");
        System.out.format("%8s %8s %8s %8s %8s", "2", "20", "42", "60", "64\n");
        System.out.format("%8s %8s %8s %8s %8s", "14", "25", "32", "55", "70\n");
        System.out.format("%8s %8s %8s %8s %8s", "5", "18", "FREE", "53", "67\n");
        System.out.format("%8s %8s %8s %8s %8s", "12", "16", "31", "46", "75\n");
        System.out.format("%8s %8s %8s %8s %8s", "10", "22", "39", "59", "71\n");
    }
}
