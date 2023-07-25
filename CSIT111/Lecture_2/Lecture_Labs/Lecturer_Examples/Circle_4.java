// Given a radius of a circle.
// - We wish to compute its area and its perimeter.
// - Display the info.
//
// Explore the use of some methods defined in the Math class
// For example, PI belongs to the Math class
//
// File name: Circle_4a.java
//
// Explore the use of static import in our program
import static java.lang.Math.*;
import static java.lang.System.*;

class Circle_4a
{
	public static void main (String [ ] args)
	{
		// Declare variables
		double radius;
		double area, perimeter;
		
		// Generate a random value and assign to radius
		// This value is between 0 and 100
		radius = random () * 100;
		
		// Compute its area and its perimeter
		area = PI * radius * radius;
		perimeter = 2.0 * PI * radius;
		
		// Display the results
		out.print ("Given radius = ");
		out.println (radius);
		
		out.print ("Area = ");
		out.println (area);
		
		out.print ("Perimeter = ");
		out.println (perimeter);
	}
}