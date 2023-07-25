// What is a student?
// - A student has a name
// - A student has an id
// - A student has a gender
// - A student takes two subjects
// - A student has marks for the two subjects
//
// File name: TestStudent_3.java
//
// Explore some user defined methods
//  - static methods
//  - formal parameters and actual parameters can have the same name
//    but different locations
//  - we can call a method in another method
//
// We add in an enum class
//
// Explore some static variables defined inside the class

import java.util.Scanner;

enum Subject {CSIT111, CSIT113, CSIT121, CSIT114}

class TestStudent_4
{
		// Declare student info using private static variables
	private static String name;
	private static int id;
	private static char gender;
	private static Subject subject1;
	private static Subject subject2;
	private static double mark1;
	private static double mark2;
	
	// Formal parameters are mark1 and mark2
	private static double getAverage (double mark1, double mark2)
	{
		double average = (mark1 + mark2) / 2.0;
		
		return average;
	}
	
	private  static int getFinalMark (double mark1, double mark2)
	{
		// we call the get average method above
		double average = getAverage (mark1, mark2);
		int finalMark = (int) (average + 0.5);
		
		return finalMark;
	}
	
	public static void main (String [ ] args)
	{
		// Construct a Scanner class object
		Scanner input = new Scanner (System.in);
		
		// Read in the student info
		System.out.print ("Enter name: ");
		name = input.nextLine ();
		
		System.out.print ("Enter student id: ");
		id = input.nextInt ();
		
		System.out.print ("Enter gender: ");
		gender = input.next ().charAt (0);
		
		// Note the conversion from Strings to enum constants
		System.out.print ("Enter two subjects: ");
		subject1 = Subject.valueOf (input.next ());
		subject2 = Subject.valueOf (input.next ());
		
		System.out.print ("Enter two marks: ");
		mark1 = input.nextDouble ();
		mark2 = input.nextDouble ();
		
		// We call the getAverage and getFinalMark methods
		// to get the information
		double average = getAverage (mark1, mark2); // actual marks are mark1 and mark2
		int finalMark = getFinalMark (mark1, mark2);
		
		// Display student info
		System.out.println ("\nStudent information");
		System.out.printf ("\tName: %s%n", name);
		System.out.printf ("\tStudent id: %d%n", id);
		System.out.printf ("\tGender: %c%n", gender);
		System.out.printf ("\tSubject 1: %s, mark: %.1f%n", subject1, mark1);
		System.out.printf ("\tSubject 2: %s, mark: %.1f%n", subject2, mark2);
		System.out.printf ("\tAverage: %.1f%n", average);
		System.out.printf ("\tFinal mark: %d%n", finalMark);
	}
}
