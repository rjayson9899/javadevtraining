package chapterSix;

import java.util.Scanner;

public class Exercises {
    public static void runExerciseOne(Scanner in) {
        boolean[] isPrime = new boolean[2];
        int[] get = new int[2];

        System.out.print("Enter the first value: ");
        get[0] = in.nextInt();
        System.out.print("Enter the second value: ");
        get[1] = in.nextInt();

        isPrime[0] = true;
        isPrime[1] = true;
        for (int i = 0; i < 2; i++) {
            for (int j = 2; j < get[i]; j++) {
                if ((get[i]%j) == 0) {
                    isPrime[i] = false;
                }
            }
        }

        if (isPrime[0] && isPrime[1]) {
            System.out.println(get[0] + " and " + get[1] + " are both prime");
        }
        else if (isPrime[0]) {
            System.out.println(get[0] + " is prime");
        }
        else if (isPrime[1]) {
            System.out.println(get[1] + " is prime");
        }
    }

    public static void runExerciseTwo (Scanner in) {
        int cnt = 2;
        int get;
        
        System.out.print("Input a positive integer: ");
        get = in.nextInt();

        System.out.print("The prime factors are: ");
        do {
            if ((get % cnt) == 0) {
                get /= cnt;
                System.out.print(cnt + " ");
            }
            else {
                cnt++;
            }
        } while (get != 1);
    }

    public static void runExerciseFive (Scanner in) {
        int get, length;
        String lengthBuffer;

        System.out.print("Enter a positive integer: ");
        get = in.nextInt();

        lengthBuffer = Integer.toString(get);
        length = lengthBuffer.length();

        for (int i = (length - 1); i >= 0; i--) {
            double power = Math.pow(10, i);
            int digit = get / (int) power;
            get -= digit * (int) power;
            System.out.println(digit);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] exercises = new String[] {"Exercise One", "Exercise Two", "Exercise Five"};
        int sel;
        int i = 1;

        for (String element: exercises) {
            System.out.println(i + ". " + element);
            i++;
        }
        System.out.print("Select Exercise to test: ");
        sel = in.nextInt();

        switch (sel) {
            case 1:
                runExerciseOne(in);
                break;
            case 2:
                runExerciseTwo(in);
                break;
            case 3:
                runExerciseFive(in);
                break;
        }
        
        in.close();
    }
}
