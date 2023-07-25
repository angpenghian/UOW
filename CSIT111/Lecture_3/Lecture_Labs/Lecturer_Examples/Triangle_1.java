// Read in the three sides of a triangle.
// - we wish to compute its area and its perimeter
// - display the information
//
// File name: Triangle_1.java
import java.util.Scanner;

class Triangle_1
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
		
		//display the info
		System.out.println("\nTriangle information: ");
		System.out.println("\ta = " + a);
		System.out.println("\tb = " + b);
		System.out.println("\tc = " + c);
		System.out.println("\tarea = " + area);
		System.out.println("\tperimeter = " + perimeter);
		input.close();
	}
}
