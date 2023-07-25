// Read in a radius of a circle.
// - We wish to compute its area and its perimeter.
// - Display the info.
//
// File name: Circle_5.java

import java.util.Scanner;

class Circle_5
{
	// We prefer to declare constants inside a class and outside of the method (s)
	// These constants MUST BE static
	// And usually we prefer to declare them as private
	private static final double PI = 3.14159256;
	
	public static void main (String [ ] args)
	{
		// Construct a Scanner class object
		// Here we want to use keyboard to do the data entry
		Scanner input = new Scanner (System.in);
		
		// Declare variables
		double radius;
		double area, perimeter;
		
		// Read a real number and assign to radius
		System.out.print ("Enter a radius: ");
		radius = input.nextDouble ();
		
		// Compute its area and its perimeter
		area = PI * radius * radius;
		perimeter = 2.0 * PI * radius;
		
		// Display the results
		// Using the +, known as concatenation i.e joining them together
		// More decoration of output, \n means leave a blank line
		//                                             \t means have a tab key before printing
		System.out.println ("\nCircle information");
		System.out.println ("\tGiven radius = " + radius);
		System.out.println ("\tArea = " + area);
		System.out.println ("\tPerimeter = " + perimeter);

		input.close();
	}
}