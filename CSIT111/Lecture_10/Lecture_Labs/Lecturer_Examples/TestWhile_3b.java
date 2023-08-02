// There are three types of while loops
// - sentinel controlled while loop 
// - counter controlled while loop 
// - flag controlled while loop (this example)
//
// File name: TestWhile_3b.java
//
// Objective: Read in a positive integer n and a digit k. We wish to know if k
//                   is in n. For example n = 12345
//                                                   k = 2 ==> k is in n
//                                                   n = 8 ==> k is not in n
// 
//
// Read 3 sets of information to test your design
//
// Explore the use of user defined methods

import java.util.Scanner;

class TestWhile_3b
{
	// This method checks if a digit k is in a positive integer n
	private static boolean digitInInteger (int n, int k)
	{
		int lastDigit;
		boolean found = false;
		
		while (!found && n > 0)
		{
				lastDigit = n % 10;
				
				if (k == lastDigit)
					found = true;
				else
					n = n / 10;			//remove the last digit of n
		}
		
		return found;
	}
	
	public static void main (String [ ] args)
	{
		// Define a Scanner class object
		Scanner input = new Scanner (System.in);
		
		// Declare variables
		int n;
		int k;
		
		int count = 1;
		while (count <= 3)
		{
			System.out.printf ("Set no %d%n", count);
			
			// Read in the info
			System.out.print ("Enter a positive integer: ");
			n = input.nextInt ();
			
			System.out.print ("Enter a digit: ");
			k = input.nextInt ();
			
			boolean found = digitInInteger (n, k);
				
			if (found)
				System.out.printf ("==> Digit %d is  found in %d%n", k, n);
			else
				System.out.printf ("==> Digit %d is not found in %d%n", k, n);
			
			++count;
			System.out.println ("----------------------------------------------");
		}
	}
}	
	