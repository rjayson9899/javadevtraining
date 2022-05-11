package chapter10CaseStudy;

/**
 * Customer class.
 */
public class Customer {
    private String firstName, lastName, street,
                    city, state, zip;
    
    /**
    * constructor
    * pre: none
    * post: A Customer object has been created. 
    * Customer data has been initialized with parameters.
    */
    public Customer(String fName, String lName, String street,
                        String city, String state, String zip) {
    this.firstName = fName;
    this.lastName = lName;
    this.street = street;
    this.city = city;
    this.state = state;
    this.zip = zip;
    }
    /** 
    * Returns a String that represents the Customer object.
    * pre: none
    * post: A string representing the Customer object has 
    * been returned.
    */
    public String toString() {
    String custString;
    custString = firstName + " " + lastName + "\n";
    return(custString);
    }

    public void changeStreet(String street){
        this.street = street;
    }

    public void changeCity(String city){
        this.city = city;
    }

    public void changeState(String state){
        this.state = state;
    }

    public void changeZip(String zip){
        this.zip = zip;
    }


   }
