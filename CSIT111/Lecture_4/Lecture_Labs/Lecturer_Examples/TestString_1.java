// Some examples on String objects
//
// Objective: How to read a String and a character?
//  ==> Aik Koan Heng ==> A.K. Heng
//
// File name: TestString_1.java
import java.util.Scanner;

class TestString_1
{
	public static void main (String [ ] args)
	{
		// Construct a Scanner class object
		Scanner input = new Scanner (System.in);
		
		// Declare variables
		String firstName;
		String secondName;
		String lastName;
		char gender;
		
		// Read in the information
		System.out.print ("Enter your name: ");
		firstName = input.next ();
		secondName = input.next ();
		lastName = input.next ();
		
		System.out.print ("Enter your gender: ");
		gender = input.next ().charAt (0);
		
		// Form a full name
		String fullName = firstName + " " + secondName + " " + lastName;
		String alsoKnownAs = firstName.charAt (0) + ". " +
											 secondName.charAt (0) + ". " +
											 lastName;
											 
		// Display the result
		System.out.println ("\nYour information");
		System.out.printf ("\tYour full name: %s%n", fullName);
		System.out.printf ("\tAlso known as: %s%n", alsoKnownAs);
		System.out.printf ("\tYour gender: %c%n", gender);	
	}
}