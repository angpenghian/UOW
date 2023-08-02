package UOW.CSIT111.Lecture_4.Labs;

enum Type {
    Equilateral, Isosceles, Scalene, NotTriangle
}

class PossibleTriangle {
    // Instance Variables
    private int a, b, c;
    private Type pt;

    // Constructor
    public PossibleTriangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Private method to check if 3 numbers can form a triangle
    private boolean isTriangle() {
        return a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a;
    }

    // Private method to check the type of triangle
    private Type getType() {
        if (!isTriangle())
            return Type.NotTriangle;
        else if (a == b && b == c)
            return Type.Equilateral;
        else if (a != b && a != c && b != c)
            return Type.Scalene;
        else
            return Type.Isosceles;
    }

    // Public method to print the triangle's information
    public void displayInfo() {
        this.pt = getType();
        switch (pt) {
            case Equilateral:
                System.out.println("Triangle is Equilateral: All sides are equal");
                break;
            case Scalene:
                System.out.println("Triangle is Scalene: All sides are different");
                break;
            case Isosceles:
                System.out.println("Triangle is Isosceles: Two sides are equal");
                break;
            case NotTriangle:
                System.out.println("These sides do not form a Triangle");
                break;
        }
    }
}

public class Lab_4 {
    public static void main(String[] args) {
        PossibleTriangle t1 = new PossibleTriangle(4, 5, 6);
        PossibleTriangle t2 = new PossibleTriangle(1, 2, 3);
        PossibleTriangle t3 = new PossibleTriangle(4, 5, 5);
        PossibleTriangle t4 = new PossibleTriangle(6, 6, 6);

        t1.displayInfo();
        t2.displayInfo();
        t3.displayInfo();
        t4.displayInfo();
    }
}
