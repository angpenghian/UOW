// Read in the three sides of a triangle.
// - we wish to compute its area and its perimeter
// - display the information
//
// Explore the use of printf methods
//
// File name: Triangle_2b.java
import java.util.Scanner;

class Triangle_2b
{
	public static void main (String [ ] args)
	{
	
		// Construct Scanner
		Scanner input = new Scanner(System.in);
		
		//declaration of variable
		double a;
		double b;
		double c;
		
		//read in the three sides
		System.out.print("Enter the three sides: ");
		a =  input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		//compute the area and the perimeter
		double s = (a + b + c) / 2.0;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		double perimeter = a + b + c;
		
		//display the info (Note that compiler right justify the printing)
		
		System.out.println ("\nTriangle information: ");
		System.out.printf ("\ta = %10.4f%n" ,  a);
		System.out.printf ("\tb = %10.4f%n" ,  b);
		System.out.printf ("\tc = %10.4f%n" ,  c);
		System.out.printf ("\tarea = %10.4f%n" ,  area);
		System.out.printf ("\tperimeter = %10.4f%n" ,  perimeter);
		input.close();
	}
}
