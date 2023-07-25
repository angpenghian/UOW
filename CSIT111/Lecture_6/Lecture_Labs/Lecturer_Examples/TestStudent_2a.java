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
//
// We add in a other constructor
//
// Introduce a process info method (this method is defined inside the student class)


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
	
	// Default constructor
	public Student ( )
	{
		// do nothing
	}
	
	// Other constructor
	public Student (String name, int id, char gender, Subject subject1,
								Subject subject2, double mark1, double mark2)
	{
		// Here we initialize the instance variables
		this.name = name;
		this.id = id;
		this.gender = gender;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.mark1 = mark1;
		this.mark2 = mark2;
	}
	
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
	public void setName (String name)
	{
		this.name = name;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void setGender(char gender)
	{
		this.gender = gender;
	}
	
	public void setTwoSubjects (Subject subject1, Subject subject2)
	{
		this.subject1 = subject1;
		this.subject2 = subject2;
	}
	
	public void setTwoMarks (double mark1, double mark2)
	{
		this.mark1 = mark1;
		this.mark2 = mark2;
	}
	
	// Some other methods (can be private or public)
	private double computeAverage ()
	{
		double average = (mark1 + mark2) / 2.0;
		
		return average;
	}
	
	public double getAverage ()
	{
		return computeAverage();
	}
	
	private int computeFinalMark()
	{
		// we call the get average method above
		double average = getAverage ();
		int finalMark = (int) (average + 0.5);
		
		return finalMark;
	}
	
	public int getFinalMark ()
	{
		return computeFinalMark();
	}
	
	// In this method, it is not compulsory to access the information
	// via the accessor methods
	public void processInfo ()
	{
		// We call the getAverage and getFinalMark methods
		// to get the information
		double average = getAverage (); // actual marks are mark1 and mark2
		int finalMark = getFinalMark ();
		
		// Display student info
		System.out.println ("\nStudent information");
		System.out.printf ("\tName: %s%n", getName()); // Name is equal to null
		System.out.printf ("\tStudent id: %d%n", getId());
		System.out.printf ("\tGender: %c%n", getGender());
		System.out.printf ("\tSubject 1: %s, mark: %.1f%n", getSubject1(), getMark1());
		System.out.printf ("\tSubject 2: %s, mark: %.1f%n", getSubject2(), getMark2());
		System.out.printf ("\tAverage: %.1f%n", average);
		System.out.printf ("\tFinal mark: %d%n", finalMark);
	}
	
}

class TestStudent_2a
{
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
		
		// Construct a Student object using other constructor
		Student s = new Student (name, id, gender, subject1, subject2, mark1, mark2);
		
		// Process the student info
		s.processInfo ();
	}
}
