package ProgrammingInJava.chapter9;

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
