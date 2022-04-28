import java.util.Scanner;

public class Loops {

    public static void runExOne(){
      for (int x = 0; x < 10; x++){
          System.out.println(x);
      }  
    }

    public static void runExTwo(){
        int total = 0;
        int x;
        for (x = 1; x < 10; x += 1){
            total += x;
        }
        System.out.println(total);
    }

    public static void runExThree(){
        int numb,newnumb = 0;
        Scanner userIn = new Scanner(System.in);

        System.out.println("Enter the number: ");
        numb = userIn.nextInt();

        for( int x = 1; x < 11; x++){
            newnumb += numb;
            System.out.println(numb + " x "+ x + " = " + newnumb);
        }
        userIn.close();
    }

    public static void runExFour(){
        int num;
        int total;

        Scanner userIn = new Scanner(System.in);

        System.out.println("Enter a number: ");
        num = userIn.nextInt();
        total = num;
        for (int x = num; x > 1; x--){
            
            total += num*x;
            System.out.println(total);
        }
        System.out.println(total);
        userIn.close();
    }

    public static void runExFive(){
        int one,two, total = 0;

        Scanner userIn = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        one = userIn.nextInt();
        System.out.println(" Enter 2nd number:");
        two = userIn.nextInt();
        total = one;

        for (int x = 1; x < two; x++){
            total *= one;
            System.out.println(total);
        }
        System.out.println(total);
        userIn.close();
    }

    public static void runExSix(){
        int one,two, total = 0;

        Scanner userIn = new Scanner(System.in);

        System.out.println("Enter a number ");
        one = userIn.nextInt();
        
        userIn.close();
    }

    public static void main(String[] args){
     runExFive();
    }
}