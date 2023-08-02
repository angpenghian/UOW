// There are three types of while loops
// - sentinel controlled while loop 
// - counter controlled while loop (this example)
// - flag controlled while loop
//
// File name: TestWhile_2c.java
//
// Objective: Generate 10 integers. During the generation, we wish to determine
//                   the largest and the smallest integers
//
// Note the use Random class API
import java.util.Random;

class TestWhile_2c
{
	public static void main (String [ ] args)
	{
		// Define a Random class object
		Random input = new Random ();
		
		// Declare variables
		int n;
		int largestNo;
		int smallestNo;
		int count;
		
		// Read in the 1st integer
		System.out.print ("Generate integer 1: ");
		n = input.nextInt ();
		System.out.println (n);
		
		// Initialize the largest number, the smallest number and the count
		largestNo = n;
		smallestNo = n;
		count = 2;
		
		// Continue to generate some more integers
		while (count <= 10)
		{
			System.out.printf ("Generate integer %d: ", count++);
			n = input.nextInt ();
			System.out.println (n);
			
			if (n > largestNo)
				largestNo = n;
			
			if (n < smallestNo)
				smallestNo = n;
			
			// count = count + 1;
		}
		
		System.out.printf ("\nThe largest integer is %d%n", largestNo);
		System.out.printf ("The smallest integer is %d%n", smallestNo);
		
	}
}	
	