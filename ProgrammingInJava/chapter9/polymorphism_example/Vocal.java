package ProgrammingInJava.chapter9.polymorphism_example;

public class Vocal extends Instrument {
    
    public Vocal(String singerName){
        super(singerName);
    }

    public String makeSound() {
        return("LaLaLa");
    }

    public String toString() {
        return(super.getMusician() + " sings " + makeSound() + ".");
    }

    
}
