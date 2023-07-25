// Read in the length and the width of a rectangle.
// - we wish to compute and display its area and its perimeter
//
// File name: Rectangle.java

import java.util.Scanner;

class Rectangle
{
	public static void main (String [ ] args)
	{
		// Construct a Scanner class object
		Scanner input = new Scanner (System.in);
		
		// Declare two variables
		int length, width;
		
		// Prompt user to enter the length and the width
		System.out.print ("Enter the length and the width: ");
		length = input.nextInt ();
		width = input.nextInt ();
		
		// Compute the area and the perimeter
		int area = length * width;
		int perimeter = 2 * (length + width);
		
		// Display the info
		System.out.println ("\nRectangle information");
		System.out.println ("\tLength = " + length);
		System.out.println ("\tWidth = " + width);
		System.out.println ("\tArea = " + area);
		System.out.println ("\tPerimeter = " + perimeter);

		input.close();
	}
}