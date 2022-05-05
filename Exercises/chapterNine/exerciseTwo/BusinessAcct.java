package Exercises.chapterNine.exerciseTwo;

public class BusinessAcct extends Account {
    
    public BusinessAcct (double bal, String fName, String lName, String str, String city, String st, String zip) {
        super(bal, fName, lName, str, city, st, zip);
        if (super.getBalance() < 500) {
            System.out.println("Account created with balance less than $500. $10.0 has been deducted");
            if (bal >= 10.0) {
                super.withdrawal(10.0);
            }
            else {
                super.withdrawal(bal);
            }
        }
    }
}