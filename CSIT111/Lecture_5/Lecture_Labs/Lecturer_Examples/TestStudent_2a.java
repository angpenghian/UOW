// What is a student?
// - A student has a name
// - A student has an id
// - A student has a gender
// - A student takes two subjects
// - A student has marks for the two subjects
//
// File name: TestStudent_2a.java
//
// To design a complete class that describe the student class

import java.util.Scanner;

enum Subject {CSIT111, CSIT113, CSIT121, CSIT114}

class Student
{
	// Declare student info using private non-static variables, also called instance variables
	private String name;
	private int id;
	private char gender;
	private Subject subject1;
	private Subject subject2;
	private double mark1;
	private double mark2;
	
	// Accessor methods (must be public)
	public String getName()
	{
		return name;
	}
	
	public int getId ()
	{
		return id;
	}
	
	public char getGender()
	{
		return gender;
	}
	
	public Subject getSubject1()
	{
		return subject1;
	}
	
	public Subject getSubject2()
	{
		return subject2;
	}
	
	public double getMark1()
	{
		return mark1;
	}
	
	public double getMark2()
	{
		return mark2;
	}
	
	// Mutator methods (to update the instance variables)
	public void setName (String aName)
	{
			name = aName;
	}
	
	public void setId(int anId)
	{
		id = anId;
	}
	
	public void setGender(char aGender)
	{
		gender = aGender;
	}
	
	public void setSubject1(Subject s1)
	{
		subject1 = s1;
	}
	
	public void setSubject2(Subject s2)
	{
		subject2 = s2;
	}
	
	public void setMark1(double m1)
	{
		mark1 = m1;
	}
	
	public void setMark2(double m2)
	{
		mark2 = m2;
	}
	
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

class TestStudent_2a
{
	// Main class needs to access of public static information
	// defined in another class via the class name, i.e. Student
	
	public static void main (String [ ] args)
	{
		// Construct a Scanner class object
		Scanner input = new Scanner (System.in);
		
		//Declare some local variables
		String name;
		int id;
		char gender;
		Subject subject1;
		Subject subject2;
		double mark1;
		double mark2;

		//Construct an object of a student class
		Student s = new Student();
		
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
		
		// Update student info
		s.setName (name);
		s.setId (id);
		s.setGender(gender);
		s.setSubject1(subject1);
		s.setSubject2(subject2);
		s.setMark1(mark1);
		s.setMark2(mark2);
		
		// We call the getAverage and getFinalMark methods
		// to get the information
		double average = s.getAverage (mark1, mark2); // actual marks are mark1 and mark2
		int finalMark = s.getFinalMark (mark1, mark2);
		
		// Display student info
		System.out.println ("\nStudent information");
		System.out.printf ("\tName: %s%n", s.getName()); // Name is equal to null
		System.out.printf ("\tStudent id: %d%n", s.getId());
		System.out.printf ("\tGender: %c%n", s.getGender());
		System.out.printf ("\tSubject 1: %s, mark: %.1f%n", s.getSubject1(), s.getMark1());
		System.out.printf ("\tSubject 2: %s, mark: %.1f%n", s.getSubject2(), s.getMark2());
		System.out.printf ("\tAverage: %.1f%n", average);
		System.out.printf ("\tFinal mark: %d%n", finalMark);
	}
}
