// Read in the three sides of a triangle.
// - we wish to compute its area and its perimeter
// - display the information
//
// To have a table for output
//
//      No          a              b             c            area           perimeter
//      --------------------------------------------------------------------------
//      001         ***.**     ***.**    ***.**    ****.**     ****.**
//      002           **.**         *.**     **.**        **.**       ***.**
//      --------------------------------------------------------------------------
//
// File name: Triangle_4.java

import java.util.Scanner;

class Triangle_4
{
	private static final String LINE = "----------" + "----------" + "----------" + "----------" + "----------" + "-----";
	
	public static void main (String [ ] args)
	{
		// Construct Scanner
		Scanner input = new Scanner(System.in);
		
		//declaration of variable
		double a1, a2;
		double b1, b2;
		double c1, c2;
		
		//read in the three sides
		System.out.print("Enter the three sides: ");
		a1 =  input.nextDouble();
		b1 = input.nextDouble();
		c1 = input.nextDouble();
		
		//compute the area and the perimeter
		double s = (a1 + b1 + c1) / 2.0;
		double area1 = Math.sqrt(s*(s-a1)*(s-b1)*(s-c1));
		double perimeter1 = a1 + b1 + c1;
		
		System.out.println (LINE);
		
		//To get rid of an input buffer
		input.nextLine();
		
		//read in the three sides
		System.out.print("Enter the three sides: ");
		a2 =  input.nextDouble();
		b2 = input.nextDouble();
		c2 = input.nextDouble();
		
		//compute the area and the perimeter
		s = (a2 + b2 + c2) / 2.0;
		double area2 = Math.sqrt(s*(s-a2)*(s-b2)*(s-c2));
		double perimeter2 = a2 + b2 + c2;
		
		//display the table
		System.out.println();
		System.out.printf ("%-5s" + "%-10s" + "%-10s" + "%-10s" + "%-10s" + "%-10s%n",
		                                "No", "a", "b", "c", "area", "perimeter");
		System.out.println(LINE);
		
		System.out.printf ("%03d  " + "%-10.3f" + "%-10.3f" + "%-10.3f" + "%-10.3f" + "%-10.3f%n",
										1, a1, b1, c1, area1, perimeter1);
										
		System.out.printf ("%03d  " + "%-10.3f" + "%-10.3f" + "%-10.3f" + "%-10.3f" + "%-10.3f%n",
										2, a2, b2, c2, area2, perimeter2);
										
		System.out.println(LINE);								
		input.close();
	}
}
