// Given a radius of a circle.
// - We wish to compute its area and its perimeter.
// - Display the info.
//
// File name: Circle_1.java

class Circle_1
{
	public static void main (String [ ] args)
	{
			// Declare variables
		double radius;
		double area, perimeter;
		
		// Assign a value to radius
		radius = 123.4567;
		
		// Compute its area and its perimeter
		area = 3.14159 * radius * radius;
		perimeter = 2.0 * 3.14159 * radius;
		
		// Display the results
		System.out.print ("Given radius = ");
		System.out.println (radius);
		
		System.out.print ("Area = ");
		System.out.println (area);
		
		System.out.print ("Perimeter = ");
		System.out.println (perimeter);
	}
}