package ProgrammingInJava.chapter6;

public class Investment{
    public static void main(String[] args) {
        final double amount_Final = 5000.0;
        double interest = 0.075;
        double totalVal = 2500.0;
        int yrs = 0;

        do{
            totalVal += totalVal * interest;
            yrs++;
        } while (totalVal < amount_Final);
        System.out.print(yrs);
    }
}


