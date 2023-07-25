package UOW.CSIT111.Lecture_4.Lecture_Labs.Lecture_Notes_Examples;

import static java.lang.System.out;

public class Example_identical_names {
    private static int number, code;
    public static void main(String[] args) {
        number = 1; // the class scope variable is used
        testLocal();
        out.println("main() method: " + number + " " + code);
    }

    public static void testLocal() {
        int number = 99; // a method scope variable is declared (local)
        out.println( "testLocal() method: " + number + " " + code);
        }
}
/* If a local variable has the same name as a class
scope variable, the local one has a higher priority */