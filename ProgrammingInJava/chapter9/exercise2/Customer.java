package ProgrammingInJava.chapter9.exercise2;

public class Customer{

    private String firstName, lastName, street, city, state, zip;

    public Customer(String firstName, String lastName, String street, String city, String state, String zip){
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String toString(){
        String custString;

        custString = firstName + " " + lastName + "\n";
        custString += street + "\n";
        custString += city + ", " + state + " " + zip + "\n";
        return(custString); 
    }
    
    public void changeStreet(String newStreet){
        street = newStreet;
    }

    public void changeCity(String newCity){
        city = newCity;
    }

    public void changeState(String newState){
        state = newState;
    }

    public void changeZip(String newZip){
        zip = newZip;
    }
}