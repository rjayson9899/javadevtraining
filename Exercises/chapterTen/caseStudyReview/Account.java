package Exercises.chapterTen.caseStudyReview;

/**
* Account class.
*/
import java.text.NumberFormat;

public class Account {
    private double balance;
    private Customer cust;
    private String acctID;
    private String street;
    private String city;
    private String state;
    private String zip;

    /**
    * constructor
    * pre: none
    * post: An account has been created. Balance and
    * customer data has been initialized with parameters.
    */
    public Account(double bal, String fName, String lName, String street, String city, String state, String zip) {
        balance = bal;
        cust = new Customer(fName, lName);
        acctID = fName.substring(0,1) + lName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    /**
    * constructor
    * pre: none
    * post: An empty account has been created with the specified account ID.
    */
    public Account(String ID) {
        balance = 0;
        cust = new Customer("", "");
        acctID = ID;
    }

    /**
    * Returns the account ID.
    * pre: none
    * post: The account ID has been returned.
    */
    public String getID() {
        return(acctID);
    }

    /**
    * Returns the current balance.
    * pre: none
    * post: The account balance has been returned.
    */
    public double getBalance() {
        return(balance);
    }

    /**
    * A deposit is made to the account.
    * pre: none
    * post: The balance has been increased by the amount of the deposit.
    */
    public void deposit(double amt) {
        balance += amt;
    }

    /**
    * A withdrawal is made from the account if there is enough money.
    * pre: none
    * post: The balance has been decreased by the amount withdrawn.
    */
    public void withdrawal(double amt) {
        if (amt <= balance) {
            balance -= amt;
        } else {
            System.out.println("Not enough money in account.");
        }
    }

    /**
    * Change the street
    * pre: none
    * post: Street changed
    */
    public void changeStreet(String street) {
        this.street = street;
    }

    /**
    * Change the city
    * pre: none
    * post: City changed
    */
    public void changeCity(String city) {
        this.city = city;
    }

    /**
    * Change the state
    * pre: none
    * post: State changed
    */
    public void changeState(String state) {
        this.state = state;
    }

    /**
    * Change the zip
    * pre: none
    * post: zip changed
    */
    public void changeZip(String zip) {
        this.zip = zip;
    }

    /**
    * Change the street, city, state, and zip
    * pre: none
    * post: Street, city, state, and zip changed
    */
    public void changeAddress(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    /**
    * Returns a true when objects have matching account IDs.
    * pre: none
    * post: true has been returned when the objects are equal,
    * false returned otherwise.
    */
    public boolean equals(Object acct) {
        Account testAcct = (Account)acct;
        if (acctID.equals(testAcct.acctID)) {
            return(true);
        } else {
            return(false);
        }
    }

    /**
    * Returns a String that represents the Account object.
    * pre: none
    * post: A string representing the Account object has been returned.
    */
    public String toString() {
        String accountString;
        NumberFormat money = NumberFormat.getCurrencyInstance();
        accountString = street + " " + city + " " + state + ", " + zip + "\n";
        accountString = acctID + "\n";
        accountString += cust.toString();
        accountString += "Current balance is " + money.format(balance);
        return(accountString);
    }
}
