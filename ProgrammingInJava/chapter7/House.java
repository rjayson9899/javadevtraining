package ProgrammingInJava.chapter7;

public class House{
    public static void addRoof() {
        System.out.println("   / \\   ");
        System.out.println("  /   \\  ");
        System.out.println(" /     \\ ");
        System.out.println("/_______\\");
    }
    public static void addBase() {
        System.out.println("|       |");
        System.out.println("|       |");
        System.out.println("|       |");
        System.out.println("|_______|");
    }
    public static void addWalk() {
        System.out.println("    **   ");
        System.out.println("    ***********");
    }

    public static void main(String[] args) {
        addRoof();
        addBase();
        addWalk();
    }
}