// There are three types of while loops
// - sentinel controlled while loop 
// - counter controlled while loop (this example)
// - flag controlled while loop
//
// File name: TestWhile_2a.java
//
// Objective: Read in 10 integers. During the reading, we wish to determine
//                   the largest and the smallest integers

import java.util.Scanner;

class TestWhile_2a
{
	public static void main (String [ ] args)
	{
		// Define a scanner class object
		Scanner input = new Scanner (System.in);
		
		// Declare variables
		int n;
		int largestNo;
		int smallestNo;
		int count;
		
		// Read in the 1st integer
		System.out.print ("Enter integer 1: ");
		n = input.nextInt ();
		
		// Initialize the largest number, the smallest number and the count
		largestNo = n;
		smallestNo = n;
		count = 2;
		
		// Continue to read some more integers
		while (count <= 10)
		{
			System.out.printf ("Enter integer %d: ", count);
			n = input.nextInt ();
			
			if (n > largestNo)
				largestNo = n;
			
			if (n < smallestNo)
				smallestNo = n;
			
			count = count + 1;
		}
		
		System.out.printf ("\nThe largest integer is %d%n", largestNo);
		System.out.printf ("The smallest integer is %d%n", smallestNo);
		
	}
}	
	