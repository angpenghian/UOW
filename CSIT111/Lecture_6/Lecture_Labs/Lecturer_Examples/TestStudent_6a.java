// What is a student?
// - A student has a name
// - A student has an id
// - A student has a gender
// - A student takes two subjects
// - A student has marks for the two subjects
//
// File name: TestStudent_6a.java
//
// To design a complete class that describe the student class
//
// Explore multiple constructors to describe a few types of students
//  - Student enrols to UOW, only id is given to the student
//  - Student enrols to UOW, name, id, gender are given to UOW, but student takes no subject
//  - Student enrols to UOW, and student takes one subject and also has mark for the subject
//  - Student enrols to UOW and student takes two subjects and have marks for the two subjects
//
// Exploe this use of "this" to call other constructor(s)

import java.util.Scanner;

enum Subject {CSIT111, CSIT113, CSIT121, CSIT114}

class Student
{
	private static int NO = 2023000;
	
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
		++NO;
		id = NO;
	}
	
	// Other constructor
	public Student (String name, char gender)
	{
		/*
		++NO;
		id = NO;
		*/
		
		this ();		// we call the default constructor to initialize the student id
		this.name = name;
		this.gender = gender;
	}
	
	public Student (String name, char gender, Subject subject1, double mark1)
	{
		/*
		++NO;
		id = NO;
		*/
		
		this ();		
		this.name = name;
		this.gender = gender;
		this.subject1 = subject1;
		this.mark1 = mark1;
	}
	
	public Student (String name,  char gender, Subject subject1,
								Subject subject2, double mark1, double mark2)
	{
		++NO;
		id = NO;
		
		// Here we initialize the instance variables
		this.name = name;
		this.gender = gender;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.mark1 = mark1;
		this.mark2 = mark2;
	}
	
	// Copy constructor
	public Student (Student s)
	{
		// call other constructor to initialize the instance variables
		this (s.name,  s.gender, s.subject1, s.subject2, s.mark1, s.mark2);
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
	
	// In this method, we access the instane variables directly
	public void processInfo ()
	{
		// We call the getAverage and getFinalMark methods
		// to get the information
		double average = getAverage (); // actual marks are mark1 and mark2
		int finalMark = getFinalMark ();
		
		// Display student info
		System.out.println ("\nStudent information");
		System.out.printf ("\tName: %s%n", name); 
		System.out.printf ("\tStudent id: %d%n", id);
		System.out.printf ("\tGender: %c%n", gender);
		System.out.printf ("\tSubject 1: %s, mark: %.1f%n", subject1, mark1);
		System.out.printf ("\tSubject 2: %s, mark: %.1f%n", subject2, mark2);
		System.out.printf ("\tAverage: %.1f%n", average);
		System.out.printf ("\tFinal mark: %d%n", finalMark);
		
		System.out.println ("----------------------------------------------------");
	}
	
}

class TestStudent_6a
{
	private static double getMark ()
	{
		return Math.random () * 100.0;
	}
	
	public static void main (String [ ] args)
	{
		// Construct various objects
		Student s0 = new Student ();
		Student s1 = new Student ("Heng 1", 'M');
		Student s2 = new Student ("Heng 2", 'F', Subject.CSIT111, getMark ());
		Student s3 = new Student ("Heng 3", 'M', Subject.CSIT111, Subject.CSIT113, getMark (), getMark ());
		Student s4 = new Student (s3);
		s4.setGender ('F');
		s4.setTwoMarks (getMark (), getMark ());
		
		// Process the student objects
		s0.processInfo ();
		s1.processInfo ();
		s2.processInfo ();
		s3.processInfo ();
		s4.processInfo ();
	}
}
