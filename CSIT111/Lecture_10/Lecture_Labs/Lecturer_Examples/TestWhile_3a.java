// There are three types of while loops
// - sentinel controlled while loop 
// - counter controlled while loop 
// - flag controlled while loop (this example)
//
// File name: TestWhile_3a.java
//
// Objective: Read in a positive integer n and a digit k. We wish to know if k
//                   is in n. For example n = 12345
//                                                   k = 2 ==> k is in n
//                                                   n = 8 ==> k is not in n
// 
//
// Read 3 sets of information to test your design
import java.util.Scanner;

class TestWhile_3a
{
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
			
			int lastDigit;
			boolean found = false;
			
			// while I am found it and n is still positive
			while (!found && n > 0)
			{
				lastDigit = n % 10;
				
				if (k == lastDigit)
					found = true;
				else
					n = n / 10;			//remove the last digit of n
			}
			
			if (found)
				System.out.println ("==> Digit found");
			else
				System.out.println ("==> Digit not found");
			
			++count;
			System.out.println ("----------------------------------------------");
		}
	}
}	
	