package UOW.CSIT111.Lecture_4.Lecture_Labs.Lecture_Notes_Examples;

/* Static methods defined in a class as public can be
called from other classes through the class name */

public class Example_static_methods {
    // method definition
    public static void printNumber(int n1) {
        System.out.println(n1);
    }
}

class Test {
    public void printResult() {
        Example_static_methods.printNumber(12); // a call from another class
    }
}
