// Given a radius of a circle.
// - We wish to compute its area and its perimeter.
// - Display the info.
//
// File name: Circle_2b.java

class Circle_2b
{
	// We prefer to declare constants inside a class and outside of the method (s)
	// These constants MUST BE static
	// And usually we prefer to declare them as private
	private static final double PI = 3.14159256;
	
	public static void main (String [ ] args)
	{
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