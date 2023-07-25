// Given a radius of a circle.
// - We wish to compute its area and its perimeter.
// - Display the info.
//
// File name: Circle_2a.java

class Circle_2a
{
	public static void main (String [ ] args)
	{
		// Declare a constant pi
		final double PI = 3.14159256;
		
		// Declare variables
		double radius;
		double area, perimeter;
		
		// Assign a value to radius
		radius = 123.4567;
		
		// Compute its area and its perimeter
		area = PI * radius * radius;
		perimeter = 2.0 * PI * radius;
		
		// Display the results
		System.out.print ("Given radius = ");
		System.out.println (radius);
		
		System.out.print ("Area = ");
		System.out.println (area);
		
		System.out.print ("Perimeter = ");
		System.out.println (perimeter);
	}
}