package ProgrammingInJava.chapter3;

public class AboutMe{
    public static void main(String[] args) {
        System.out.println("Edmark A");
        System.out.println("Sir Gerald");
        System.out.println("DLSU");
        System.out.println("\"We're all gonna make It\"\n");

        System.out.println("Class Schedule");
        System.out.format("%-8s %10s %12s", "Subject", "Time Start", "Time Ends\n");
        System.out.format("%-8s %10s %12s", "Math", "7:30 a.m.", "9:00 a.m.\n");
        System.out.format("%-8s %10s %12s", "English", "9:00 a.m.", "10:30 a.m.\n");
        System.out.format("%-8s %10s %12s", "Filipino", "10:30 a.m.", "12:15 p.m.\n");

    }
}