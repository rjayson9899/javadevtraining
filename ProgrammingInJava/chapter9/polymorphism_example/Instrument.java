package ProgrammingInJava.chapter9.polymorphism_example;

abstract class Instrument {
    String musician;

    public Instrument(String name) {
        musician = name;
    }

    public String getMusician() {
        return(musician);
    }

    abstract String makeSound(); 

}
