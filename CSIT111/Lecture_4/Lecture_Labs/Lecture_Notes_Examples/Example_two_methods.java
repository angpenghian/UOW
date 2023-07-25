package UOW.CSIT111.Lecture_4.Lecture_Labs.Lecture_Notes_Examples;

import java.util.Scanner;

public class Example_two_methods {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Input two numbers: ");
        double d1 = inp.nextDouble();
        double d2 = inp.nextDouble();
        double average = calculateAverage(d1, d2); // method call
        System.out.println("The average is: " + average);
    }

    public static double calculateAverage(double v1, double v2) {
        double average = (v1 + v2) / 2.0;
        return average; // this is a locally declared average
    }
}
