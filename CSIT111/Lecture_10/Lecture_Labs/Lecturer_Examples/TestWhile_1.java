// There are three types of while loops
// - sentinel controlled while loop (this example)
// - counter controlled while loop 
// - flag controlled while loop
//
// File name: TestWhile_1.java
//
// Objective: Read in some integers until a negative integer is encountered; during the
//                   the reading, we wish to determine the largest integers.
import java.util.Scanner;

class TestWhile_1
{
	public static void main (String [ ] args)
	{
		// Define a scanner class object
		Scanner input = new Scanner (System.in);
		
		// Declare variables
		int n;
		int largestNo;
		
		// Read in the 1st integer
		System.out.print ("Enter an integer: ");
		n = input.nextInt ();
		
		// Initialize the largest number
		largestNo = n;
		
		// Continue to read ... until user enters a negative integer
		//
		// this loop is called a sentinel controlled while loop as
		// it bases on a value to signal whether we want to enter to
		// the loop body
		//
		// This is not a good loop!!!!
		while (n >= 0)
		{
			System.out.print ("Enter an integer: ");
			n = input.nextInt ();				// if n is negative, we MUST come out
			
			// meaningless comparison, if n is negative
			if (n > largestNo)
				largestNo = n;
		}
		
		System.out.printf ("\nThe largest integer is %d%n", largestNo);
		
	}
}	
	