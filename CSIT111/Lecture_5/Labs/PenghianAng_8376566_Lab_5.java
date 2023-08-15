// Name: PengHian Ang
// Tutorial: T03P
// Java version: 17.0.7, 64 bit
//
// Objective: Write a program that generates two random integers between 0 and 9 and ask the user to enter the answer of the arithmetic operation of the two numbers.
// Name of the program: Penghian_Ang_Lab5.java
// Declaration: This is my own program

import static java.lang.System.*;
import java.util.Random;
import java.util.Scanner;

class MyInteger {
    // instance variable
    private int n;

    // constructors (default and ideal)
    public MyInteger() {}

    public MyInteger(int n) {
        setMyInteger(n);
    }

    // accessor method
    public int getInteger() {
        return n;
    }

    // mutator method
    public void setMyInteger(int n) {
        this.n = n;
    }
}

public class PenghianAng_8376566_Lab_5 {   
    // instance of random and scanner class
    private static final Random rand = new Random();
    private static final Scanner input = new Scanner(in);

    // method that generates and returns two MyInteger objects
    public static MyInteger[] generateTwoIntegers() {
        MyInteger m = new MyInteger(rand.nextInt(10));
        MyInteger n = new MyInteger(rand.nextInt(10));
        return new MyInteger[]{m, n};
    }

    // method to generate and return arithmetic operator + - or *
    public static char getOperator() {
        char[] operators = {'+', '-', '*'};
        return operators[rand.nextInt(3)];
    }

    // method to check answer
    public static boolean checkAnswer(int x, int y, char oper, int answer) {
        switch(oper) {
            case '+': return (x + y == answer);
            case '-': return (x - y == answer);
            default: return (x * y == answer);
        }
    }

    public static void main(String [] args) {
        out.println("Welcome to CSIT111 Arithmetic World");
        out.println("You will solve 5 difficult arithmetic");
        
        int correctCount = 0;
        
        for (int i = 1; i <= 5; i++) {
            MyInteger[] numbers = generateTwoIntegers();
            char o = getOperator();
            
            out.printf("Question %d: %d %c %d = ?%n", i, numbers[0].getInteger(), o, numbers[1].getInteger());
            out.print("Your answer: ");
            int answer = input.nextInt();
            
            if (checkAnswer(numbers[0].getInteger(), numbers[1].getInteger(), o, answer)) {
                out.println("Correct answer\n");
                correctCount++;
            } else {
                out.println("Wrong answer\n");
            }
        }

        out.printf("Your score %d/5, %s%n", correctCount, (correctCount == 5) ? "well done" : "hope you can score full mark next time");
        
        input.close();
    }
}


