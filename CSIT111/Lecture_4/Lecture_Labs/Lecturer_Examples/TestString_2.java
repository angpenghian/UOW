// Some examples on String objects
//
// Objective: How to read a String and a character?
//  ==> Aik Koan Heng ==> A.K. Heng
//
// File name: TestString_2.java
//
// The use of command line argument

class TestString_2
{	
	public static void main (String [ ] args)
	{
		// Declare variables
		String firstName;
		String secondName;
		String lastName;
		char gender;
		int age;
		double salary;
		
		// Extract the information thru the command line argument
		firstName = args [0];
		secondName = args [1];
		lastName = args [2];
		gender = args [3].charAt (0);
		age = Integer.parseInt (args [4]);
		salary = Double.parseDouble (args [5]);
		
		
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
		System.out.printf ("\tYour age: %d%n", age);
		System.out.printf ("\tYour salary: %.2f%n", salary);
	}
}