package UOW.CSIT111.Lecture_4.Lecture_Labs.Lecture_Notes_Examples;

public class Example_calling_methods {
    // method definition
    public int getSum(int n1, int n2) {
        return n1 + n1;
    }

    public void printResult() {
        int sum = getSum(2, 17); // a call within a class
    }
}
