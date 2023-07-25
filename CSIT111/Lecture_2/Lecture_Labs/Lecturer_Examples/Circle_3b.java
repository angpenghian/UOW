// Given a radius of a circle.
// - We wish to compute its area and its perimeter.
// - Display the info.
//
// Explore the use of some methods defined in the Math class
// For example, PI belongs to the Math class
//
// File name: Circle_3c.java

class Circle_3c
{
	public static void main (String [ ] args)
	{
		// Declare variables
		double radius;
		double area, perimeter;
		
		// Generate a random value and assign to radius
		// This value is between 0 and 10
		radius = Math.random () * 10;
		
		// Compute its area and its perimeter
		area = Math.PI * radius * radius;
		perimeter = 2.0 * Math.PI * radius;
		
		// Display the results
		System.out.print ("Given radius = ");
		System.out.println (radius);
		
		System.out.print ("Area = ");
		System.out.println (area);
		
		System.out.print ("Perimeter = ");
		System.out.println (perimeter);
	}
}