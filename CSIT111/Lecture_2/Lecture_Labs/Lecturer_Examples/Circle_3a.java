// Given a radius of a circle.
// - We wish to compute its area and its perimeter.
// - Display the info.
//
// Explore the use of some methods defined in the Math class
// For example, PI belongs to the Math class
//
// File name: Circle_3a.java

class Circle_3a
{
	public static void main (String [ ] args)
	{
		// Declare variables
		double radius;
		double area, perimeter;
		
		// Generate a random value and assign to radius
		radius = Math.random ();
		
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