// There are three types of while loops
// - sentinel controlled while loop (this example)
// - counter controlled while loop 
// - flag controlled while loop
//
// File name: TestWhile_1a.java
//
// Objective: Read in some integers until a negative integer is encountered; during the
//                   the reading, we wish to determine the largest integers.
//
// This is a better version
import java.util.Scanner;

class TestWhile_1a
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
		largestNo = -9999;
		
		// Continue to read ... until user enters a negative integer
		while (n >= 0)
		{
			if (n > largestNo)
				largestNo = n;
			
			System.out.print ("Enter an integer: ");
			n = input.nextInt ();
		}
		
		System.out.printf ("\nThe largest integer is %d%n", largestNo);
		
	}
}	
	