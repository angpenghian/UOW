// What is a student?
// - A student has a name
// - A student has an id
// - A student has a gender
// - A student takes two subjects
// - A student has marks for the two subjects
//
// File name: TestStudent_5.java
//
// Explore some user defined methods
//  - static methods
//  - formal parameters and actual parameters can have the same name
//    but different locations
//  - we can call a method in another method
//
// We add in an enum class
//
// An ideal student class

import java.util.Scanner;

enum Subject {CSIT111, CSIT113, CSIT121, CSIT114}

class IdealStudent
{
	// private and non static informatiion
	private String name;
	private int id;
	private char gender;
	private Subject subject1;
	private Subject subject2;
	private double mark1;
	private double mark2;
	
	// Formal parameters are mark1 and mark2
	public double getAverage (double mark1, double mark2)
	{
		double average = (mark1 + mark2) / 2.0;
		
		return average;
	}
	
	public  int getFinalMark (double mark1, double mark2)
	{
		// we call the get average method above
		double average = getAverage (mark1, mark2);
		int finalMark = (int) (average + 0.5);
		
		return finalMark;
	}
	
}

class Student
{
		// Declare student info using private static variables
	public static String name;
	public static int id;
	public static char gender;
	public static Subject subject1;
	public static Subject subject2;
	public static double mark1;
	public static double mark2;
	
	// Formal parameters are mark1 and mark2
	public static double getAverage (double mark1, double mark2)
	{
		double average = (mark1 + mark2) / 2.0;
		
		return average;
	}
	
	public  static int getFinalMark (double mark1, double mark2)
	{
		// we call the get average method above
		double average = getAverage (mark1, mark2);
		int finalMark = (int) (average + 0.5);
		
		return finalMark;
	}
}

class TestStudent_6
{
	// Main class needs to access of public static information
	// defined in another class via the class name, i.e. Student
	
	public static void main (String [ ] args)
	{
		// Construct a Scanner class object
		Scanner input = new Scanner (System.in);
		
		// Read in the student info
		System.out.print ("Enter name: ");
		Student.name = input.nextLine ();
		
		System.out.print ("Enter student id: ");
		Student.id = input.nextInt ();
		
		System.out.print ("Enter gender: ");
		Student.gender = input.next ().charAt (0);
		
		// Note the conversion from Strings to enum constants
		System.out.print ("Enter two subjects: ");
		Student.subject1 = Subject.valueOf (input.next ());
		Student.subject2 = Subject.valueOf (input.next ());
		
		System.out.print ("Enter two marks: ");
		Student.mark1 = input.nextDouble ();
		Student.mark2 = input.nextDouble ();
		
		// We call the getAverage and getFinalMark methods
		// to get the information
		double average = Student.getAverage (Student.mark1, Student.mark2); // actual marks are mark1 and mark2
		int finalMark = Student.getFinalMark (Student.mark1, Student.mark2);
		
		// Display student info
		System.out.println ("\nStudent information");
		System.out.printf ("\tName: %s%n", Student.name);
		System.out.printf ("\tStudent id: %d%n", Student.id);
		System.out.printf ("\tGender: %c%n", Student.gender);
		System.out.printf ("\tSubject 1: %s, mark: %.1f%n", Student.subject1, Student.mark1);
		System.out.printf ("\tSubject 2: %s, mark: %.1f%n", Student.subject2, Student.mark2);
		System.out.printf ("\tAverage: %.1f%n", average);
		System.out.printf ("\tFinal mark: %d%n", finalMark);
	}
}
