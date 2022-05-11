package chapterTenExercises.caseStudy;
/**
 * Customer class.
 */
public class Customer {
    private String firstName, lastName, street, state, city;
    private int zip;
    
    /**
     * constructor
     * pre: none
     * post: A Customer object has been created. 
     * Customer data has been initialized with parameters.
     */
    public Customer(String fName, String lName, String st, String c, String sta, int z) {
        firstName = fName;
        lastName = lName;
        street =st;
        city = c;
        state = sta;
        zip = z;
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
    public String changeStreet(){
        String str = "Yes";
        System.out.println("Hello");
        return str;
    }
    public void changeCity(){
        System.out.println("Yes");
    }
    public void changeState(){

    }
    public void changeZip(){

    }

}