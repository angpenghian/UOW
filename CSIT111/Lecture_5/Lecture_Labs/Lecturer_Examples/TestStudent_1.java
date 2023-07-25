// What is a student?
// - A student has a name
// - A student has an id
// - A student has a gender
// - A student takes two subjects
// - A student has marks for the two subjects
//
// File name: TestStudent_1.java
//

import java.util.Scanner;

enum Subject {CSIT111, CSIT113, CSIT121, CSIT114}

class Student
{
		// Declare student info using private static variables
	public String name;
	public int id;
	public char gender;
	public Subject subject1;
	public Subject subject2;
	public double mark1;
	public double mark2;
	
	// Formal parameters are mark1 and mark2
	public double getAverage (double mark1, double mark2)
	{
		double average = (mark1 + mark2) / 2.0;
		
		return average;
	}
	
	public int getFinalMark (double mark1, double mark2)
	{
		// we call the get average method above
		double average = getAverage (mark1, mark2);
		int finalMark = (int) (average + 0.5);
		
		return finalMark;
	}
}

class TestStudent_1
{
	// Main class needs to access of public static information
	// defined in another class via the class name, i.e. Student
	
	public static void main (String [ ] args)
	{
		// Construct a Scanner class object
		Scanner input = new Scanner (System.in);
		
		//Construct an object of a student class
		Student s = new Student();
		
		// Read in the student info
		System.out.print ("Enter name: ");
		s.name = input.nextLine ();
		
		System.out.print ("Enter student id: ");
		s.id = input.nextInt ();
		
		System.out.print ("Enter gender: ");
		s.gender = input.next ().charAt (0);
		
		// Note the conversion from Strings to enum constants
		System.out.print ("Enter two subjects: ");
		s.subject1 = Subject.valueOf (input.next ());
		s.subject2 = Subject.valueOf (input.next ());
		
		System.out.print ("Enter two marks: ");
		s.mark1 = input.nextDouble ();
		s.mark2 = input.nextDouble ();
		
		// We call the getAverage and getFinalMark methods
		// to get the information
		double average = s.getAverage (s.mark1, s.mark2); // actual marks are mark1 and mark2
		int finalMark = s.getFinalMark (s.mark1, s.mark2);
		
		// Display student info
		System.out.println ("\nStudent information");
		System.out.printf ("\tName: %s%n", s.name);
		System.out.printf ("\tStudent id: %d%n", s.id);
		System.out.printf ("\tGender: %c%n", s.gender);
		System.out.printf ("\tSubject 1: %s, mark: %.1f%n", s.subject1, s.mark1);
		System.out.printf ("\tSubject 2: %s, mark: %.1f%n", s.subject2, s.mark2);
		System.out.printf ("\tAverage: %.1f%n", average);
		System.out.printf ("\tFinal mark: %d%n", finalMark);
	}
}
