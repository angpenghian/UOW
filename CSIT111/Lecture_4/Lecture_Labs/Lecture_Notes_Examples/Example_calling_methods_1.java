package UOW.CSIT111.Lecture_4.Lecture_Labs.Lecture_Notes_Examples;

/* Methods defined in a class as public can be called
from other classes only through a reference variable */

public class Example_calling_methods_1 {
    // method definition
    public void printNumber(int n1) {
        System.out.println(n1);
    }
}

class Test {
    public void printResult() {
        Example_calling_methods_1 exVar = new Example_calling_methods_1(); // an object must be declared
        exVar.printNumber(12); // a call from another class
    }
}