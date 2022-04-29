package Exercises.chapterNine;

public class PersonalAcct extends Account {
    
    public PersonalAcct (double bal, String fName, String lName, String str, String city, String st, String zip) {
        super(bal, fName, lName, str, city, st, zip);
        if (super.getBalance() < 200) {
            System.out.println("Account created with balance less than $200. $2.0 has been deducted");
            if (bal >= 2.0) {
                super.withdrawal(2.0);
            }
            else {
                super.withdrawal(bal);
            }
        }
    }
}