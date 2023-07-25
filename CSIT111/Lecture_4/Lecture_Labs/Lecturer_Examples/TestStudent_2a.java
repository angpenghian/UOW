// What is a student?
// - A student has a name
// - A student has an id
// - A student has a gender
// - A student takes two subjects
// - A student has marks for the two subjects
//
// File name: TestStudent_2a.java
//
// Explore some user defined methods
//  - static methods
//  - if the methods are not static, main method cannot access them

import java.util.Scanner;

class TestStudent_2a
{
	private double getAverage (double x, double y)
	{
		double average = (x + y) / 2.0;
		
		return average;
	}
	
	private  int getFinalMark (double x, double y)
	{
		double average = (x + y) / 2.0;
		int finalMark = (int) (average + 0.5);
		
		return finalMark;
	}
	
	public static void main (String [ ] args)
	{
		// Construct a Scanner class object
		Scanner input = new Scanner (System.in);
		
		// Declare student info
		String name;
		int id;
		char gender;
		String subject1;
		String subject2;
		double mark1;
		double mark2;
		
		// Read in the student info
		System.out.print ("Enter name: ");
		name = input.nextLine ();
		
		System.out.print ("Enter student id: ");
		id = input.nextInt ();
		
		System.out.print ("Enter gender: ");
		gender = input.next ().charAt (0);
		
		System.out.print ("Enter two subjects: ");
		subject1 = input.next ();
		subject2 = input.next ();
		
		System.out.print ("Enter two marks: ");
		mark1 = input.nextDouble ();
		mark2 = input.nextDouble ();
		
		// We call the getAverage and getFinalMark methods
		// to get the information
		double average = getAverage (mark1, mark2);
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
