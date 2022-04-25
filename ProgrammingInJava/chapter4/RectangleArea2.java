package ProgrammingInJava.chapter4;

import java.util.Scanner;

public class RectangleArea2{
    public static void main(String[] args) {
        int length, width, area;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length: ");
        length = input.nextInt();
        System.out.print("Enter the width: ");
        width = input.nextInt();
        input.close();

        area = length * width;
        System.out.println("Area of Rectangle is: " + area);
    }
}