package UOW.CSIT121;
// Full name: Penghian Ang
// Java version: 17.0.7, 64 bit
// Tutorial Group: tutorial 1
// Declaration: I declare that this assignment is my own work and i have not passed this progranm to anyone else.
// I am willing to accept whatever penalty given to you. 

import java.util.Random;

class Point {
    private int x;
    private int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    private double distance(Point p) {
        int dx = p.x - this.x;
        int dy = p.y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double getDistance(Point p) {
        return distance(p);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}

class Line {
    Point p1;
    Point p2;

    public Line() {
        this.p1 = new Point();
        this.p2 = new Point();
    }

    public Line(Point p1, Point p2) {
        this.p1 = new Point(p1);
        this.p2 = new Point(p2);
    }

    public Line(Line aLine) {
        this.p1 = new Point(aLine.p1);
        this.p2 = new Point(aLine.p2);
    }

    public double getDistance() {
        return p1.getDistance(p2);
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public void set(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public String toString() {
        return "Line(" + p1 + ", " + p2 + ", distance = " + getDistance() + ")";
    }
}

class PenghianAng_8376566_Lab_2 {
    static Random rand = new Random();

    private static int getInt() {
        return rand.nextInt(200) - 100;
    }

    private static Point[] getTwoPoint() {
        Point[] points = new Point[2];
        points[0] = new Point(getInt(), getInt());
        points[1] = new Point(getInt(), getInt());
        return points;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Point[] points = getTwoPoint();
            Line line = new Line(points[0], points[1]);
            System.out.println("Set " + i);
            System.out.println("Given " + points[0]);
            System.out.println("Given " + points[1]);
            System.out.println(line);
            System.out.println("------------------------");
        }
    }
}
