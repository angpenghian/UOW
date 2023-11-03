package UOW.CSIT121;
// Full name: Penghian Ang
// Java version: 17.0.7, 64 bit
// Tutorial Group: tutorial 1
// Declaration: I declare that this assignment is my own work and i have not passed this progranm to anyone else.
// I am willing to accept whatever penalty given to you. 

import java.util.ArrayList;

enum ShapeColor {Blue, Yellow, Red, Green, White}

interface ForTwoD
{
    double perimeter();
    void recolor(ShapeColor sc);
}

interface ForThreeD
{
    double volume();
    void resize(double percentage);
}

interface Shape
{
    double area();
}

abstract class TwoD implements ForTwoD, Shape
{
    protected ShapeColor sc;
    protected int a;
    protected int b;
    protected int c;
    protected int d;

    public TwoD()
    {
        sc = ShapeColor.White;
        a = 1;
    }
    public TwoD(ShapeColor sc, int a)
    {
        this.sc = sc;
        this.a = a;
    }
    public TwoD(ShapeColor sc, int a, int b)
    {
        this.sc = sc;
        this.a = a;
        this.b = b;
    }
    public TwoD(ShapeColor sc, int a, int b, int c)
    {
        this.sc = sc;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public TwoD(ShapeColor sc, int a, int b, int c, int d)
    {
        this.sc = sc;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    public TwoD(TwoD td)
    {
        this(td.sc, td.a, td.b, td.c, td.d);
    }

    public int getA()
    {
        return a;
    }
    public int getB()
    {
        return b;
    }
    public int getC()
    {
        return c;
    }
    public int getD()
    {
        return d;
    }
    public ShapeColor getShapeColor()
    {
        return sc;
    }

    public void set(ShapeColor sc, int a)
    {
        this.sc = sc;
        this.a = a;
    }
    public void set(ShapeColor sc, int a, int b)
    {
        this.sc = sc;
        this.a = a;
        this.b = b;
    }
    public void set(ShapeColor sc, int a, int b, int c)
    {
        this.sc = sc;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void set(ShapeColor sc, int a, int b, int c, int d)
    {
        this.sc = sc;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public void recolor(ShapeColor sc)
    {
        do 
        {
            this.sc = ShapeColor.values()[(int)(Math.random() * (ShapeColor.values()).length)];
        }while (sc != this.sc);
    }

    @Override
    public String toString()
    {
        return String.format("%s, %d", getShapeColor(), getA());
    }
}

class Circle extends TwoD 
{
    public Circle()
    {
        super();
    }
    public Circle(ShapeColor sc, int radius)
    {
        super(sc, radius);
    }
    public Circle(Circle c)
    {
        this(c.sc, c.a);
    }

    @Override
    public double area()
    {
        return Math.PI * Math.pow(2.0, a) ;
    }

    @Override
    public double perimeter()
    {
        return Math.PI * 2.0 * a;
    }

    public int getRadius()
    {
        return a;
    }

    public void set(ShapeColor sc, int radius)
    {
        super.set(sc,radius);
    }

    @Override
    public String toString()
    {
        return String.format("Circle (2D (%s)%n)",super.toString());
    }
}

class Square extends TwoD
{
    public Square()
    {
        super();
    }
    public Square(ShapeColor sc, int length)
    {
        super(sc, length);
    }
    public Square(Square sq)
    {
        this(sq.sc, sq.a);
    }

    @Override
    public double area()
    {
        return Math.pow(a, 2.0);
    }

    @Override
    public double perimeter()
    {
        return 4.0 * a;
    }

    public int getLength()
    {
        return a;
    }

    public void set(ShapeColor sc, int length)
    {
        super.set(sc, length);
    }

    @Override
    public String toString()
    {
        return String.format("Square (2D (%s))%n",super.toString());
    }
}

class Rectangle extends Square
{
    public Rectangle()
    {
        super();
    }
    public Rectangle(ShapeColor sc, int length)
    {
        super(sc, length);
    }
    public Rectangle(ShapeColor sc, int length, int width)
    {
        super(sc, length);
        this.b = width;
    }
    public Rectangle (Rectangle r)
    {
        this(r.sc, r.a, r.b);
    }
    
    public double area()
    {
        if (b == 0)
            return super.area();
        else
            return 1.0 * a * b;
    }
    public double perimeter()
    {
        if (b == 0)
            return super.perimeter();
        else    
            return 2.0 * (a + b);
    }

    public int getWidth()
    {
        return b;
    }
    
    public void set(ShapeColor sc, int length, int width)
    {
        super.set(sc, length, width);   
    }

    public String toString()
    {
        return String.format("Rectangle (2D (%s, %d))%n",super.toString(), getWidth());
    }
}

class Triangle extends TwoD
{
    public Triangle()
    {
        super();
    }
    public Triangle(ShapeColor sc, int a, int b, int c)
    {
        super(sc, a, b, c);
    }
    public Triangle(Triangle t)
    {
        this(t.sc, t.a, t.b, t.c);
    }

    @Override
    public double area()
    {
        double s = 0.5 * (a + b + c);
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double perimeter()
    {
        return 1.0 * (a + b + c);
    }

    public int getA()
    {
        return a;
    }
    public int getB()
    {
        return b;
    }
    public int getC()
    {
        return c;
    }

    public void set(ShapeColor sc, int a, int b, int c)
    {
        super.set(sc, a, b, c);
    }

    @Override
    public String toString()
    {
        return String.format("Triangle (2D (%s, %d, %d))%n",super.toString(), getB(), getC());
    }
}

class Trapezoid extends TwoD
{
    private int h;

    public Trapezoid()
    {
        super();
    }
    public Trapezoid(ShapeColor sc, int a, int b, int c, int d, int h)
    {
        super(sc, a, b, c, d);
        this.h = h;
    }
    public Trapezoid (Trapezoid t)
    {
        this(t.sc, t.a, t.b, t.c, t.d, t.h);
    }

    @Override
    public double area()
    {
        return h * ((a + b) * 0.5);
    }

    @Override
    public double perimeter()
    {
        return 1.0 * (a + b + c + d);
    }

    public int getA()
    {
        return a;
    }
    public int getB()
    {
        return b;
    }
    public int getC()
    {
        return c;
    }
    public int getD()
    {
        return d;
    }
    public int getHeight()
    {
        return h;
    }

    public void set(ShapeColor sc, int a, int b, int c, int d, int h)
    {
        super.set(sc, a, b, c, d);
        this.h = h;
    }
    public String toString()
    {
        return String.format("Trapezoid (2D (%s, %d, %d, %d))%n",super.toString(), getB(), getC(), getD());
    }
}

abstract class ThreeD implements Shape, ForThreeD
{
    protected ShapeColor sc;
    protected double a;

    public ThreeD()
    {
        sc = ShapeColor.White;
        a = 1.0;
    }
    public ThreeD(ShapeColor sc, double a)
    {
        this.sc = sc;
        this.a = a;
    }
    public ThreeD(ThreeD td)
    {
        this(td.sc, td.a);
    }

    public double getA()
    {
        return a;
    }
    public ShapeColor getShapeColor()
    {
        return sc;
    }

    public void set(ShapeColor sc, double a)
    {
        this.sc = sc;
        this.a = a;
    }

    @Override
    public void resize(double percentage)
    {
        this.a = a * ((100.0 - percentage)/100.0);
    }

    @Override 
    public String toString()
    {
        return String.format("%s, %.3f ", getShapeColor(), getA());
    }
}

class Cube extends ThreeD
{
    public Cube()
    {
        super();
    }
    public Cube(ShapeColor sc, double a)
    {
        super(sc, a);
    }
    public Cube(Cube c)
    {
        this(c.sc, c.a);
    }

    @Override
    public double area()
    {
        return 6.0 * Math.pow(a, 2.0);
    }

    @Override
    public double volume()
    {
        return Math.pow(a, 3.0);
    }

    public double getA()
    {
        return a;
    }

    public void set(ShapeColor sc, double a)
    {
        super.set(sc, a);   
    }

    @Override
    public String toString()
    {
        return String.format("Cube (3D (%s))", super.toString());
    }
}

class Tetraherdron extends ThreeD
{
    public Tetraherdron()
    {
        super();
    }
    public Tetraherdron(ShapeColor sc, double a)
    {
        super(sc, a);
    }
    public Tetraherdron(Tetraherdron t)
    {
        this(t.sc, t.a);
    }
    
    @Override
    public double area()
    {
        return Math.sqrt(3.0) * Math.pow(a, 2.0);
    }
    @Override
    public double volume()
    {
        return Math.pow(a, 3) / (6 * Math.sqrt(2));
    }

    public double getA()
    {
        return a;
    }

    public void set(ShapeColor sc, double a)
    {
        super.set(sc, a);   
    }

    @Override
    public String toString()
    {
        return String.format("Tetrahedron (3D (%s))%n", super.toString());
    }
}

class Sphere extends ThreeD
{
    public Sphere()
    {
        super();
    }
    public Sphere(ShapeColor sc, double a)
    {
        super(sc, a);
    }
    public Sphere(Sphere s)
    {
        this(s.sc, s.a);
    }

    @Override
    public double area()
    {
        return 4 * Math.PI * Math.pow(a, 2);
    }
    @Override
    public double volume()
    {
        return (4 / 3) * Math.PI * Math.pow(a, 3); 
    }
    
    public double getA()
    {
        return a;
    }

    public void set(ShapeColor sc, double a)
    {
        super.set(sc, a);   
    }

    @Override
    public String toString()
    {
        return String.format("Tetrahedron (3D (%s))%n", super.toString());
    }
}

class PenghianAng_8376566_A2 
{
    private static int getInt()
    {
        return (int)(Math.random() * 5 + 1);
    }
    private static double getDouble()
    {
        return (Math.random() * 25.0 + 1.0);
    }
    private static ShapeColor getShapeColor()
    {
        return ShapeColor.values()[(int)(Math.random() * (ShapeColor.values()).length)];
    }
    private static boolean isTriangle(int a, int b, int c)
    {
        return ((a > 0 && b > 0 && c > 0) && ((a + b > c) && (a + c > b) && (b + c > a)));
    }
    private static TwoD getTwoD()
    {
        int randomNumber = (int)(Math.random() * 5);
        TwoD shape = null;
        ShapeColor sc = getShapeColor();
        switch (randomNumber)
        {
            case 0:
                shape = new Circle(sc, getInt());
                break;
            case 1:
                shape = new Square(sc, getInt());
                break;
            case 2:
                shape = new Rectangle(sc, getInt(), getInt());
                break;
            case 3:
                do{
                    shape = new Triangle(sc, getInt(), getInt(), getInt());
                }while (!isTriangle(shape.getA(), shape.getB(), shape.getC()));
                break;
            default:
                shape = new Trapezoid(sc, getInt(), getInt(), getInt(), getInt(), getInt());
                break;
        }
        if (shape instanceof Rectangle)
        {
            Rectangle rectangle = (Rectangle) shape;
            if (rectangle.getLength() == rectangle.getWidth())
            {
                return new Square(rectangle.getShapeColor(),rectangle.getLength());
            }
        }
        return shape;
    }
    private static ThreeD getThreeD()
    {
        int randomNumber = (int)(Math.random() * 3);
        ThreeD shape = null;
        ShapeColor sc = getShapeColor();
        switch (randomNumber)
        {
            case 0:
                shape = new Cube(sc, getDouble());
                break;
            case 1:
                shape = new Tetraherdron(sc, getDouble());
                break;
            default:
                shape = new Sphere(sc, getDouble());
                break;
        }
        return shape;
    }
    private static void process2DShape(Shape ss)
    {
        TwoD downcast = (TwoD) ss;
        downcast.recolor(getShapeColor());
    }
    private static void process3DShape (Shape ss)
    {
        ThreeD downcast = (ThreeD) ss;
        double resize = getDouble();
        downcast.resize(resize);
        System.out.printf("Size reduced by %.1f%%: ",resize);
    }
    private static void displayAList(ArrayList<Shape> aList)
    {
        int index = 0;
        for (Shape ss : aList)
        {
            ++index;
            System.out.printf("Shape %d: %s", index, ss);
            System.out.println();
            if(ss instanceof TwoD)
            {
                process2DShape(ss);
                TwoD downcast2D = (TwoD) ss;
                System.out.printf("Updated color: %s%n", downcast2D.getShapeColor());
                System.out.printf("Area = %.3f%n", ss.area());
                System.out.printf("Perimeter = %.3f%n",downcast2D.perimeter());
                System.out.printf("I am a %s shape with color changed to %s%n", ss.getClass().getName(), downcast2D.getShapeColor());
            }
            else
            {
                ThreeD downcast3D = (ThreeD) ss;
                System.out.printf("Surface area = %.3f%n",ss.area());
                System.out.printf("Volume = %.3f%n", downcast3D.volume());
                process3DShape(downcast3D);
                System.out.printf("%s%n", ss);
                System.out.printf("Updated surface area = %.3f%n", ss.area());
                System.out.printf("Updated volume = %.3f%n", downcast3D.volume());
                System.out.printf("I am a %s shape%n", ss.getClass().getName());
            }
            System.out.println("----------------------------------------------------");
        }
    }
    public static void main(String [] args)
    {
        ArrayList<Shape> aList = new ArrayList<Shape>();
        int k;
        do
        {
            k = (int)(Math.random() * 3);
            switch (k)
            {
                case 1:
                    aList.add(getTwoD());
                    break;
                case 2:
                    aList.add(getThreeD());
                    break;
                default:
                    aList.add(getTwoD());
            }
        }while(k > 0);
        displayAList(aList);
    }
}
