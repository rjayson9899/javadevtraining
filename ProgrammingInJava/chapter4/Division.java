package ProgrammingInJava.chapter4;

public class Division{
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;
        int result;

        double dnum1 = 5;
        double dnum2 = 3;
        double dresult;

        result = num1 / num2;
        System.out.println("num1 / num2: " + result);

        dresult = dnum1 / dnum2;
        System.out.println("DoubleNum1 / DoubleNum2: " + dresult);

        dresult = num1 / dnum2;
        System.out.println("num1 / Dnum2: " + dresult);

        result = num1 % num2;
        System.out.println("num1 % num2: " + result);

        dresult = dnum1 % dnum2;
        System.out.println("dnum1 % dnum2: " + dresult);
    }
}