// Read in the three sides of a triangle.
// - we wish to compute its area and its perimeter
// - display the information
//
// How to get rid of input buffer?
//
// File name: Triangle_3.java
import java.util.Scanner;

class Triangle_3
{
	private static final String LINE = "----------------------------------------";
	
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
		
		//display the info (Note that compiler left justify the printing)
		
		System.out.printf ("%s%n", "\nTriangle information: ");
		System.out.printf ("\ta = %-10.4f%n" ,  a);
		System.out.printf ("\tb = %-10.4f%n" ,  b);
		System.out.printf ("\tc = %-10.4f%n" ,  c);
		System.out.printf ("\tarea = %-10.4f%n" ,  area);
		System.out.printf ("\tperimeter = %-10.4f%n" ,  perimeter);
		
		System.out.println (LINE);
		
		//To get rid of an input buffer
		input.nextLine();
		
		//read in the three sides
		System.out.print("Enter the three sides: ");
		a =  input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		//compute the area and the perimeter
		s = (a + b + c) / 2.0;
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		perimeter = a + b + c;
		
		//display the info (Note that compiler left justify the printing)
		
		System.out.printf ("%s%n", "\nTriangle information: ");
		System.out.printf ("\ta = %-10.4f%n" ,  a);
		System.out.printf ("\tb = %-10.4f%n" ,  b);
		System.out.printf ("\tc = %-10.4f%n" ,  c);
		System.out.printf ("\tarea = %-10.4f%n" ,  area);
		System.out.printf ("\tperimeter = %-10.4f%n" ,  perimeter);
		input.close();
	}
}
