package ProgrammingInJava.chapter4;

import java.text.NumberFormat;

public class NumberFormatTest {

    public static void exerciseFormat(){
        double dollars = 21.5;
        int num = 1234;
        double numWithDecimal = 2.0 / 3.0;
        double sale = .15;
        NumberFormat money = NumberFormat.getCurrencyInstance();
        NumberFormat number = NumberFormat.getIntegerInstance();
        NumberFormat decimal = NumberFormat.getNumberInstance();
        NumberFormat percent = NumberFormat.getPercentInstance();

        System.out.println(money.format(dollars));
        System.out.println(number.format(num));
        System.out.println(decimal.format(numWithDecimal));
        System.out.println(percent.format(sale));

    }

    public static void main(String[] args) {
        exerciseFormat();
    }
}